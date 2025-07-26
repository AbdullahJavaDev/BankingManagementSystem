package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {

	Connection con;
	Statement stmt;
	
	public ConnectionFactory() {
		
		try {
			String url="jdbc:mysql://localhost:3306/BankingManagementSystem";
			String userName="root";
			String password="SHAIKSQL123";
			//Loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Successfully loaded");
			
			//Establishing Connection
			con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connection established");
			stmt=con.createStatement();
			
		}
		catch(ClassNotFoundException ae) {
			System.out.println("Driver is not Loaded");
			ae.printStackTrace();
		}
		catch(SQLException ae1) {
			System.out.println("Something Went Wrong!..");
			ae1.printStackTrace();
		}
	}
	
}
