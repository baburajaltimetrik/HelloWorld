package com.example.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Component;

@Component
public class DBConnectivity {

	public static String USERNAME="root";
	public static String PASSWORD="root";
	public static String DB_URL="jdbc:postgresql://127.0.0.1:5432/test";
	
	public void connectToDB() throws Exception{
		Connection con = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		PreparedStatement psmt = con.prepareStatement("Select * from ababu");
	}
}
