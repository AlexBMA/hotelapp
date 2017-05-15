package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {

	private static Connection conn;
	static String url = "jdbc:mysql://localhost:3306/";
	private static String userName = "hbstudent";
	private static String password = "hbstudent";
	private static String dbName = "app_test_schema";
	private static String driver = "com.mysql.jdbc.Driver";

	public static void makeConn() {
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url + dbName, userName, password);
			System.out.println("Connected to the database");

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public static Connection getConn() {
		if (conn == null)
			makeConn();
		return conn;
	}

	public static void CloseConn() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

}
