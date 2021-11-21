package jdbcpack;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBCDemo2 {
	public static void main(String[] args)throws Exception {
		//Step 1 - Load or Register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
				
		//Step 2 - Establish the connection
				
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost/knights","root","root");
		
		Statement st=con.createStatement();
		
		//int noofrowsupdated=st.executeUpdate("insert into users values (3,'john','tiger',0)");
		
		//System.out.println("No of rows inserted...:"+noofrowsupdated);
		
		int noofrowsupdated=st.executeUpdate("update users set flag=1");
		
		System.out.println("no of rows updated for flag...:"+noofrowsupdated);
		
		ResultSet rs=st.executeQuery("select * from users");
		
		while(rs.next()) {
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getString(3)+"\t");
			System.out.print(rs.getInt(4)+"\t");
			System.out.println();
		}
		
		
	}
}