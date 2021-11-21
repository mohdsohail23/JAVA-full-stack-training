package Day16;
/*
 * 1. Sub class replacing the super class
 * 2. Object reusability
 * 3. Code reusability
 * 4. multiple inheritance
 * 5. Overriding
 * 6. Constructor Overriding
 * 7. super
 * 8. abstract
 * 9. interfaces
 */
public class RevisionGen1{
	public static void main(String[] args) {
		// subclass replacing the superclass
		Employee e=new Engineer();
		e=new Attendar();
		acceptEmployee(new Engineer());
		acceptEmployee(new Attendar());
		acceptEngineer(new Engineer());
		//acceptEngineer(new Attendar());
	}
	public static void acceptEmployee(Employee e) {	}
	public static void acceptEngineer(Engineer en) {}
}
class Employee{}
class Engineer extends Employee{}//engineer is a kind of employee
class Attendar extends Employee{}//attendar is also a kind of employee