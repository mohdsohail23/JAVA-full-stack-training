package learnXML;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo1_1 {
	public static void main(String[] args) throws Exception{
		//1)load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		//establish connection
		Connection CON=DriverManager.getConnection("jdbc:mysql://localhost/knights", "root", "root");
		
		Statement SM=CON.createStatement();
		
		ResultSet RS=SM.executeQuery("select * from users where flag=1");
		
		while(RS.next()) {
			System.out.println(RS.getString("username")+" :: "+RS.getString("userpass"));
		}		
	}
}
