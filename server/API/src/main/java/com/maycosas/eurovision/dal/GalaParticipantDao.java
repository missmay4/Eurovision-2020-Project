package com.maycosas.eurovision.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.maycosas.eurovision.entities.GalaParticipant;

@Repository
public class GalaParticipantDao {

	/**
	 * 
	 * @param gala_id
	 * @return Select all data from GalaParticipant table from a specific Gala
	 * @throws SQLException
	 */
	public ArrayList<GalaParticipant> findByGala(int gala_id) throws SQLException {
		ArrayList<GalaParticipant> participants = new ArrayList<GalaParticipant>();
		String sql = "SELECT * FROM galaparticipant WHERE gala_id = ?";

		try (Connection conn = getConn();
				PreparedStatement query = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

			query.setInt(1, gala_id);

			try (ResultSet rs = query.executeQuery()) {
				while (rs.next()) {

					GalaParticipant participant = new GalaParticipant();
					participant.setId(rs.getInt("id"));
					participant.setGala_id(rs.getInt("gala_id"));
					participant.setParticipant_id(rs.getInt("participant_id"));
					participant.setPoints(rs.getInt("points"));

					participants.add(participant);
				}
			}
		}

		return participants;
	}

	/**
	 * 
	 * @param participant_id
	 * @return Find an specific participant in the table Galaparticipant
	 * @throws SQLException
	 */
	public List<GalaParticipant> findByParticipant(int participant_id) throws SQLException {

		List<GalaParticipant> galaP = new ArrayList<GalaParticipant>();

		String sql = "SELECT * FROM galaparticipant WHERE participant_id = ?";
		try (Connection conn = getConn();
				PreparedStatement query = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			query.setInt(1, participant_id);

			try (ResultSet rs = query.executeQuery()) {
				while (rs.next()) {
					GalaParticipant participant = new GalaParticipant();
					participant.setId(rs.getInt("id"));
					participant.setGala_id(rs.getInt("gala_id"));
					participant.setParticipant_id(rs.getInt("participant_id"));
					participant.setPoints(rs.getInt("points"));
					participant.setPerformanceOrder(rs.getInt("performanceorder"));

					galaP.add(participant);
				}
			}
		}
		return galaP;

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
