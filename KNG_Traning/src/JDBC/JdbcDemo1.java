package learnXML;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class JdbcDemo1 {
	public static void main(String[] args)throws Exception {
		//Step 1 - Load or Register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2 - Establish the connection
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost/knights","root","root");
		
		DatabaseMetaData dbmd=con.getMetaData();
		System.out.println("DatabaseProductName     :  "+dbmd.getDatabaseProductName());
		System.out.println("DatabaseProductVersion  :"+dbmd.getDatabaseProductVersion());
		System.out.println("getStringFunctions      : "+dbmd.getStringFunctions());
		System.out.println("DriverMajorVersion      : "+dbmd.getDriverMajorVersion());
		System.out.println("DriverMinorVersion      :"+dbmd.getDriverMinorVersion ());
		System.out.println("DriverName		    	: "+dbmd.getDriverName ());
		System.out.println("SQLKeywords 		    : "+dbmd.getSQLKeywords());
		con.close();
		
//		Statement st=con.createStatement();

//		PreparedStatement pst= con.prepareStatement("select * from users where flag=?");
//		pst.setInt(1, 0);
//		ResultSet rs=pst.executeQuery();
//		
//		while (rs.next()) {
//			System.out.print(rs.getInt(1)+"   ::  ");
//			System.out.print(rs.getString(2)+"   ::  ");
//			System.out.print(rs.getString(3));
//			System.out.println();
//		}
		
	}
}
