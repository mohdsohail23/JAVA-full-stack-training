package Jdbclab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class jdbcDemo3 {
	public static void main(String[] args)throws Exception {
		//Step 1 - Load or Register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
				
		//Step 2 - Establish the connection
				
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost/knights","root","root");
//		
//		PreparedStatement st=con.prepareStatement("insert into users values (?,?,?,?)");
//		
//		st.setInt(1, 4);
//		st.setString(2, "mohan");
//		st.setString(3, "secret");
//		st.setInt(4, 1);
//		
//		int noofrowsupdated=st.executeUpdate();
//		
//		System.out.println("No of rows inserted...:"+noofrowsupdated);
		
//		PreparedStatement st=con.prepareStatement("update users set flag=?");
//		st.setInt(1, 0);
//		int noofrowsupdated=st.executeUpdate();
//		
//		System.out.println("no of rows updated for flag...:"+noofrowsupdated);
//		
		PreparedStatement st=con.prepareStatement("select * from users where username=?");
		st.setString(1, "ram");
		ResultSet rs=st.executeQuery();
//		
		if(rs.next()) {
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getString(3)+"\t");
			System.out.print(rs.getInt(4)+"\t");
			System.out.println();
		}
//		
		
	}
}