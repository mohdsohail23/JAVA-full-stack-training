package componentStore;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import emailComponent.Email;

public class rmi_Client {
	public static void main(String[] args) throws Exception{
		Business business=(Business)Naming.lookup("rmi://localhost:1099/SohailStore");
		
		Object obj=business.getSohailStoreObject();
		
		Email email=(Email)obj;
		email.EmailService();
		
		
	}
}
