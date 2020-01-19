package database_connectivity;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class jdbc {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
	      Connection con;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","Chandan-2409");
		
	      CallableStatement stmt = null;
	      String sql = "{call employees.joinfetch()}";
	      stmt = con.prepareCall(sql);
	      
	      System.out.println("Executing stored procedure..." );
	     ResultSet rs = stmt.executeQuery();
	      System.out.println("FirstName  LastName Depart_id Department_name");
	      while (rs.next()) {
	         String fname = rs.getString("firstname");
	         String lname = rs.getString("lastname");
	         	int d_id = rs.getInt("depart_id");
	         String dname = rs.getString("d_name");

	         System.out.println(fname + "    " + lname+"   "+d_id + "    " + dname);
	    }
		} catch (SQLException e) {
			e.printStackTrace();
		}

	      

	}

}
