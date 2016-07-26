package com.spring.mvc.utility;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBUtility {

	private static Connection connection = null;

	public static Connection getConnection() {
		if (connection != null) {
			return connection;
		} else {
			try {
				Properties prop = new Properties();
				InputStream inputStream = DBUtility.class.getResourceAsStream("/config.properties");
				prop.load(inputStream);

				String driver = prop.getProperty("driver");
				String url = prop.getProperty("url");
				String user = prop.getProperty("user");
				String password = prop.getProperty("password");

				Class.forName(driver);
				connection = DriverManager.getConnection(url, user, password);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
}
