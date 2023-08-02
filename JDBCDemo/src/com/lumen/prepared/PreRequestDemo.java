package com.lumen.prepared;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class PreRequestDemo {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mysql";
		String username = "root";
		String password = "admin@123";
		String sql = "select * from newmovies where language =?";
		
		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery();){
			preparedStatement.setString(4 , "English");
//			set values for the place holder
//				Scanner scanner = new Scanner(System.in)) {
//			for (int i = 0; i < 1; i++) {
//				System.out.println("Enter movie name : ");
//				String moviename = scanner.next();
//				System.out.println("Enter movieId : ");
//				int movieId = scanner.nextInt();
//				System.out.println("Enter genere name : ");
//				String genre = scanner.next();
//				System.out.println("Enter language : ");
//				String language = scanner.next();
			
			
			while(resultSet.next()) {
				String name = resultSet.getString("moviename");
				int movieId = resultSet.getInt("movieId");
				String genre = resultSet.getString("genre");
				String language = resultSet.getString("language");
				System.out.println(name+"\t"+movieId+"\t"+genre+"\t"+language);

          
				
			}
//
//				preparedStatement.setString(1, moviename);
//				preparedStatement.setInt(2, movieId);
//				preparedStatement.setString(3, genre);
//				preparedStatement.setString(4, language);
//			}
//			execute the statement
			preparedStatement.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
