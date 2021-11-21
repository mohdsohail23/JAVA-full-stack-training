package hiberknights;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		Employee emp=new Employee();
	//	emp.setEid(100);
		emp.setEname("Sohail");
		emp.setEpass("Sparrow");
		emp.setEsal(40000);
		
		session.save(emp);
		session.beginTransaction().commit();
	}
}
