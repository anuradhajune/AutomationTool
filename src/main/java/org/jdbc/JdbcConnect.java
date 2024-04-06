package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Result;

public class JdbcConnect {
	public static void main(String[] args) {
		Connection con=null;
		try {

			//load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. connect the database
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","admin");
			
			//3. write a sql query
			String Query="select * from employees";
			
			//4. prepare the statement
			PreparedStatement s= con.prepareStatement(Query);
			
			//5. Execute Query
			ResultSet rs= s.executeQuery();
			
			//6. Iterate the results
			while(rs.next()) {
				int empid=rs.getInt("employee_id");
				System.out.println(empid);
				String firstname=rs.getString("First_name");
				System.out.println(firstname);
				
			}
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	private static String getString(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
