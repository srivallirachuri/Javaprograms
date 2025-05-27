package Jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbcex {
	public static void main(String [] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");//register the driver
		
		
		//Establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "Srivalli@16");
		System.out.println("connection created");
		
		java.sql.Statement stm=con.createStatement();//creates select statement
		
		ResultSet rs=stm.executeQuery("SELECT * FROM Employee");
		int empid;
		String city;
		
		while(rs.next())//moves the point in the current row to the next row in the result set. This method is used to iterate through each of the rows returned by the result set. This method returns true, unless it is the last row of the result set, at which time it returns false.
		{
			empid=rs.getInt("empid");
			city=rs.getString("city");
			System.out.println(empid + " " +city);
		}
	}


}
