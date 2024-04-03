package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnect {
	private static Connection conn;

	public static Connection getConn() {

		try {
			if (conn==null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/amp","root","cBjg6H@1");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

}
