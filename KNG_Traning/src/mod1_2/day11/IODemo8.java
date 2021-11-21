package mod1_2.day11;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class IODemo8 {
	public static void main(String[] args) throws Exception{
		Laddu laddu=new Laddu();
		System.out.println("Before eating laddu..:"+laddu.size);
		laddu.size=8;
		System.out.println(laddu.a);
		laddu.a=101010110;
		FileOutputStream fos=new FileOutputStream("laddu.dat");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(laddu);
		
		laddu.size=5;
		System.out.println("After eating Laddu..:"+laddu.size);
		
		FileInputStream fis=new FileInputStream("laddu.dat");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Laddu laddu2=(Laddu)ois.readObject();
		
		System.out.println(laddu2.size);
		System.out.println(laddu2.a);
	}
}
class Laddu implements Serializable{
	 int size=10;
	 transient int a=100;
}