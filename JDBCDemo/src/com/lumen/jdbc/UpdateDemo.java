package com.lumen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateDemo {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mysql";
		String username = "root";
		String password = "admin@123";
		
//		String query = "create table employee(name varchar(20),employeeId int primary key,city varchar(20),salary float)";
//		String query = "insert into employee values('Yash',101,'rajasthan',45000)";
		Scanner scanner = new Scanner(System.in);
		String query = "UPDATE employee "
				+ "SET City='Chittorgarh'"
				+ "WHERE employeeID=101;";
		
		try (
			Connection connection =   DriverManager.getConnection(url,username,password);
			Statement statement = connection.createStatement()){
			boolean result = statement.execute(query);
			System.out.println("Table created "+result);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}