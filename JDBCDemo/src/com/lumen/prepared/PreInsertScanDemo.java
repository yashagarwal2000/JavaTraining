package com.lumen.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreInsertScanDemo {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mysql";
		String username = "root";
		String password = "admin@123";
		String sql = "insert into newmovies values(?,?,?,?)";

		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
//			set values for the place holder
			preparedStatement.setString(1, "24");
			preparedStatement.setInt(2, 10);
			preparedStatement.setString(3, "thriller");
			preparedStatement.setString(4, "English");

//			execute the statement
			preparedStatement.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
