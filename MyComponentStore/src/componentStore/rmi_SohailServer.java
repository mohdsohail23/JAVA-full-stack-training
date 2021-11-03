package componentStore;

import java.io.FileInputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Enumeration;
import java.util.Properties;

import emailComponent.BulkEmailComponent;
import emailComponent.Email;

public class rmi_SohailServer extends UnicastRemoteObject implements Business{

	public rmi_SohailServer() throws RemoteException {
		// TODO Auto-generated constructor stub
	}
	
//	@Override
//	public Object getSohailStoreObject() throws RemoteException {
//		System.out.println("<<..Welcome to Sohail Stores..>>"); 
//		try {
//		Object Obj=Proxy.newProxyInstance(new MyApp().getClass().getClassLoader(),
//				new Class[] {Email.class}, new MyInvocationHandler(new Object[] {new MyApp(),
//						new BulkEmailComponent()}));
//		return Obj;
//		}catch(Exception e) {
//			System.out.println(e);
//			return null;
//		}
//	}
	
	@Override
	public Object getSohailStoreObject() throws RemoteException {
		int count=0;
		try {
			Properties prop=new Properties();
			prop.load(new FileInputStream("service-config.properties"));
			Enumeration counten=prop.elements();
			int noofservices=0;
			while(counten.hasMoreElements()) {
				noofservices=noofservices+1;
				System.out.println(counten.nextElement());
			}
			System.out.println("No of services...:"+noofservices);
			Class c[]=new Class[noofservices];
			Object o[]=new Object[noofservices];
			Enumeration en=prop.elements();
			while(en.hasMoreElements()) {
				String serviceConfigFile=(String)en.nextElement();
				System.out.println("service files...:"+serviceConfigFile);
				Properties servicesProp=new Properties();
				servicesProp.load(new FileInputStream(serviceConfigFile));
				String interfaceimpl=servicesProp.getProperty("interfaceimpl");
				String interfacename=servicesProp.getProperty("interfacename");
				o[count]=Class.forName(interfaceimpl).getConstructor(null).newInstance(null);
				c[count]=Class.forName(interfacename);
				//list.add(Class.forName(interfacename));
				//list.add(interfacename);
				++count;
				}
			
			Object obj=Proxy.newProxyInstance(new MyApp().getClass().getClassLoader(), 
					c,new MyInvocationHandler(o));
			//System.out.println("The object...:"+obj);
			return obj;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
		rmi_SohailServer SS=new rmi_SohailServer();
		LocateRegistry.createRegistry(1099);
		Naming.bind("rmi://localhost:1099/SohailStore", SS);
		
		System.out.println("Server ready......");
		
	}
}
class MyApp implements Serializable{
	
}
class MyInvocationHandler implements InvocationHandler,Serializable{
	Object o[];
	public MyInvocationHandler(Object[] o) {
		this.o=o;
	}
	Object r=null;
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		for(Object obj:o) {
			try {
			r=method.invoke(obj, args);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		return r;
	}
	
}