package learnXML;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
public class JDBCDemo4 {
	public static void main(String[] args)throws Exception {
		//Step 1 - Load or Register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
				
		//Step 2 - Establish the connection
				
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost/knights","root","root");
		
		CallableStatement cs=con.prepareCall("{call P1(?,?)}");
		
		cs.setString(1, "sparrow");
		
		cs.registerOutParameter(2,Types.INTEGER);
		
		cs.execute();
		
		int pass=cs.getInt(2);
		
		System.out.println("The Userpass value of ram is...:"+pass);
	}
}