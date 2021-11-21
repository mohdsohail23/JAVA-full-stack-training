package restknights;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
@Path("/objectservice")
public class ObjectService {
	
	Employee emp=new Employee(1,"rahim","secret",1000);
	
	@GET
	@Path("/getEmp")
	@Produces("application/xml")
	public Employee getEmployee() {	
		System.out.println("get employee method called....");
		return emp;
	}
	
	@POST 
	@Path("setEmp")
	@Consumes("application/xml")
	public void setEmployee(Employee emp) {
		this.emp=emp;
	}
}
