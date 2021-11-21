package learnXML;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
public class JDBCDemo5 {
	public static void main(String[] args)throws Exception {
		//Step 1 - Load or Register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
				
		//Step 2 - Establish the connection
				
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost/knights","root","root");
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery("select * from users");
		
		ResultSetMetaData rsmd=rs.getMetaData();
		
		int noofcolumns=rsmd.getColumnCount();
		
		for(int i=1;i<=noofcolumns;i++) {
			System.out.print(rsmd.getColumnName(i)+"\t\t");
			System.out.println(rsmd.getColumnTypeName(i)+" \t");
		}
		System.out.println();
		
		while(rs.next()) {
			for(int i=1;i<=noofcolumns;i++) {
				System.out.print(rs.getString(i)+"   \t");
			}
			System.out.println();
		}
	}
}