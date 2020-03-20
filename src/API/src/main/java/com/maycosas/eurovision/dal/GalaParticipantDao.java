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

	public List<GalaParticipant> findByParticipant(int participant_id) throws SQLException {
		
		List<GalaParticipant> galaP = new ArrayList<GalaParticipant>();
		
		
		String sql = "SELECT * FROM galaparticipant WHERE participant_id = ?";
		try (Connection conn = getConn();
				PreparedStatement query = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			query.setInt(1, participant_id);
			
			try (ResultSet rs = query.executeQuery()){
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
