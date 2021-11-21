package jdbcpack;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JdbcDemo1 {
	public static void main(String[] args)throws Exception {
		//Step 1 - Load or Register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2 - Establish the connection
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost/Knights","root","root");
		
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery("select * from users");
		
		while(rs.next()) {
			System.out.println(rs.getInt("userid"));
			System.out.println(rs.getString("username"));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
		}
	}
}