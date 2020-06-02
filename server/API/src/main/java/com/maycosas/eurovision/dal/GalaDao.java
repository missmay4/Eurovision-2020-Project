package com.maycosas.eurovision.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.maycosas.eurovision.entities.Gala;

@Repository
public class GalaDao {
	@Autowired
	private GalaParticipantDao participantDao;

	/**
	 * 
	 * @return Select all data from Gala table
	 * @throws SQLException
	 */
	public ArrayList<Gala> findAll() throws SQLException {

		try (Connection conn = getConn(); Statement query = conn.createStatement()) {
			try (ResultSet rs = query.executeQuery("SELECT * FROM gala")) {
				ArrayList<Gala> galas = new ArrayList<>();

				while (rs.next()) {
					Gala gala = new Gala();
					gala.setId(rs.getInt("id"));
					gala.setType(Gala.Type.valueOf(rs.getString("type")));
					gala.setDate(rs.getDate("date").toLocalDate());
					gala.setParticipants(participantDao.findByGala(gala.getId()));

					galas.add(gala);
				}

				return galas;

			}
		}
	}

	/**
	 * Conexion with the database
	 * 
	 * @return
	 */
	public Connection getConn() {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException ex) {
			System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
		}

		Connection connection = null;
		// Database connect
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/eurovision2020", "postgres",
					"1234");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;

	}

}
