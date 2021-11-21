package restknights;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloWorld {
	
	@GET
	@Path("/say")
	public void sayHello() {
		System.out.println("Welcome to REST.....................");
	}
}
