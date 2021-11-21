package hiberknights;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class ReadClient2 {
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration().configure();
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		Query query=session.createQuery("from empEntity");
		
		query=session.createQuery("from empEntity empObj where empObj.eid=1");
		
		query=session.createQuery("from empEntity empObj where empObj.eid=:id");
		
		query.setParameter("id",Integer.valueOf(1));
		
		query=session.createQuery("from empEntity empObj where empObj.eid=?");
		query.setParameter(0, Integer.valueOf(2));
		
		
		
		List<Employee> list=query.list();
		
		for(Employee e:list) {
			System.out.println(e.getEname());
		}
//		System.out.println(emp1.getEname());
	}
}