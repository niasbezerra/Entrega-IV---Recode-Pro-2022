package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	
	public static Connection getConnection() {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bd_maldivastravel", "root","88147320");
					
	}catch (Exception e) {
		System.out.println (e);
		
	}                   
		return con;
}
}