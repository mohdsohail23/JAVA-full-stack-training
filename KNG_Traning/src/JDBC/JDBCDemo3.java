package learnXML;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBCDemo3 {
	public static void main(String[] args)throws Exception {
		//Step 1 - Load or Register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
				
		//Step 2 - Establish the connection
				
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost/knights","root","root");
		
//		PreparedStatement st=con.prepareStatement("insert into users values (?,?,?,?)");
//		PreparedStatement st=con.prepareStatement("insert into users values(?,?,?,?)");
//		PreparedStatement ps=con.prepareStatement("insert into customer_master values (?,?,?,?)");
		
		
//		ps.setInt(1, 11);
//		ps.setString(2, "aaa");
//		ps.setString(3, "kdksgfa");
//		ps.setString(4, "kjjskj");
		PreparedStatement ps=con.prepareStatement("delete from customer_master where customer_name=?");
		ps.setString(1, "aaa");
		ps.execute();
		
		//int noofrowsupdated=ps.executeUpdate();
		
		System.out.println("No of rows inserted...:"+ps.execute());
//		
//		PreparedStatement Pst=con.prepareStatement("update users set userpass=?");
//		Pst.setString(1, "sniper");
//		int noofrowsupdate=Pst.executeUpdate();
//		
//		System.out.println("no of rows updated for flag...:"+noofrowsupdate);
	
//		PreparedStatement st=con.prepareStatement("select * from users where username=?");
//		st.setString(1, "sparrow");
//		ResultSet rs=st.executeQuery();
//		
//		if(rs.next()) {
//			System.out.print(rs.getInt(1)+"\t");
//			System.out.print(rs.getString(2)+"\t");
//			System.out.print(rs.getString(3)+"\t");
//			System.out.print(rs.getInt(4)+"\t");
//			System.out.println();
//		}	
	}
}
