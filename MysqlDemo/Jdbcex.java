package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbcex {
	public static void main(String [] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");//register the driver
		
		
		//Establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/unisoft", "root", "root");
		System.out.println("connection created");
		
	}

}
