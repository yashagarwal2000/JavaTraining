package com.lumen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTable {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mysql";
		String username = "root";
		String password = "admin@123";
		
//		String query = "create table employee(name varchar(20),employeeId int primary key,city varchar(20),salary float)";
//		String query = "insert into employee values('Yash',101,'rajasthan',45000)";
		try (
			Connection connection =   DriverManager.getConnection(url,username,password);
			Statement statement = connection.createStatement();
				Scanner scanner = new Scanner(System.in)){
			for (int i = 0; i < 4; i++) {
				System.out.println("Enter book title name");
				String name = scanner.next();
				System.out.println("Enter employeeiId");
				int employeeId = scanner.nextInt();
				System.out.println("Enter city");
				String City = scanner.next();
				System.out.println("Enter the salary");
				double Salary = scanner.nextDouble();
				String sql = "insert into employee values(' " + name + "', " + employeeId + ",' " + City + " ', " + Salary

                        + ")";
			}
			int result = statement.execute(sql);
			System.out.println("Table created "+result);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
