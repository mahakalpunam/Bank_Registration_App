package bank.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection myConnection() {
		Connection con=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","root");
			System.out.println("Connection to database "+con);
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			  
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
