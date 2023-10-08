package com.tka.day24_20_sept_23;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class Test {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is Loaded Sucessfully...");

			//connetion to database
			String url="jdbc:mysql://localhost:3306/";
			String dbname="emp";
			String username="admin";
			String password= "root";

			Connection con=DriverManager.getConnection(url+dbname,username,password);

			if(con!=null) {
				System.out.println("Connection is establised Sucessfully...");
			}

			Statement stmt= (Statement)con.createStatement();

			String querry="select * from empl";

			ResultSet rs =stmt.executeQuery(querry);

			while(rs.next()) {

				//System.out.println(rs.next());	
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println();
			}
			
			rs.close();
			stmt.close();
			con.close();
		}
		
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} 
		
		catch (SQLException e) {

			e.printStackTrace();
		}
	}
}