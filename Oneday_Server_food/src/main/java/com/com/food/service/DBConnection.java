package com.com.food.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static Connection DBConn;
	
	static {

		String dbDriver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "food";
		String password = "food" ;
		
		try {
			Class.forName(dbDriver);
			
			DBConn = DriverManager.getConnection(url, user, password);
			System.out.println("DB 드라이버 접속 성공.");
			
		} catch (SQLException e) {
			System.out.println("DB 드라이버 접속 실패.");
		} catch (ClassNotFoundException e) {
			System.out.println("DB 드라이버를 찾을 수 없습니다.");
		}
	
	}
	
	public static Connection getDBConnection() {
		return DBConn ;
	}
	
}
