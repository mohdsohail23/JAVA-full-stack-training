package hiberknights;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class ReadClient {
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration().configure();
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		//get will do a eager loading...
//		Employee emp=(Employee)session.get(Employee.class, Integer.valueOf(1));
		
//		System.out.println(emp.getEname());
//		
//		emp.setEsal(3000);
//		
//		session.beginTransaction().commit();
		
		//load will do a lazy loading
		Employee emp1=(Employee)session.load(Employee.class,Integer.valueOf(2));
		
		System.out.println(emp1.getEpass());
	}
}