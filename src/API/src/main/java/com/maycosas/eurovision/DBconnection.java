package com.maycosas.eurovision;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	
	public DBconnection () {
		
	}
	
	public Connection connect() {
		try { 
		    Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException ex) {
		    System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
		}
		
		Connection connection = null;
		// Database connect
		// Conectamos con la base de datos
		try {
			connection = DriverManager.getConnection(
			        "jdbc:postgresql://127.0.0.1:5432/eurovision2020",
			        "postgres", "1234");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
		
	}
	
}
