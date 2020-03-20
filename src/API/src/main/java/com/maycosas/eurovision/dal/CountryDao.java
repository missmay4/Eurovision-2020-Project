package com.maycosas.eurovision.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.maycosas.eurovision.entities.Country;

@Repository
public class CountryDao {

	public List<Country> findAllCountries() throws SQLException {

		try (Connection conn = getConn(); Statement query = conn.createStatement()) {
			try (ResultSet rs = query.executeQuery("SELECT * FROM country")) {
				List<Country> countries = new ArrayList<>();

				while (rs.next()) {
					Country country = new Country();
					country.setName(rs.getString("name"));
					country.setCode(rs.getString("code"));
					country.setId(rs.getInt("id"));
					countries.add(country);
				}

				return countries;

			}
		}
	}

	public Country findCountry(int country_id) throws SQLException {
		try (Connection conn = getConn(); Statement query = conn.createStatement()) {
			try (ResultSet rs = query.executeQuery("SELECT * FROM country WHERE id = " + country_id)) {
				rs.next();
				Country country = new Country();
				country.setId(rs.getInt("id"));
				country.setName(rs.getString("name"));
				country.setCode(rs.getString("code"));

				return country;

			}

		}
	}

	public Connection getConn() {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException ex) {
			System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
		}

		Connection connection = null;
		// Database connect
		// Conectamos con la base de datos
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/eurovision", "mayte", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;

	}
}
