package com.maycosas.eurovision.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.maycosas.eurovision.entities.GalaParticipant;
import com.maycosas.eurovision.entities.Participant;

@Repository
public class ParticipantDao {

	@Autowired
	private CountryDao countriesDao;
	@Autowired
	private GalaParticipantDao galaParticipantDao;

	/**
	 * 
	 * @return Select all data from Participant table
	 * @throws SQLException
	 */
	public List<Participant> findAllParticipant() throws SQLException {

		try (Connection conn = getConn(); Statement query = conn.createStatement()) {
			try (ResultSet rs = query.executeQuery("SELECT * FROM participant")) {
				List<Participant> participants = new ArrayList<>();

				while (rs.next()) {
					for (GalaParticipant galaP : galaParticipantDao.findByParticipant(rs.getInt("id"))) {
						Participant participant = new Participant();
						participant.setId(rs.getInt("id"));
						participant.setCountry(countriesDao.findCountry(rs.getInt("country_id")));
						participant.setName(rs.getString("name"));
						participant.setSong(rs.getString("song"));
						participant.setYear(rs.getInt("year"));
						participant.setSong_link(rs.getString("song_link"));
						participant.setLanguage(rs.getString("language"));
						participant.setGala(galaP);

						participants.add(participant);

					}

				}

				return participants;
			}
		}
	}

	/**
	 * 
	 * @param id
	 * @return Select all data from an specific Participant
	 * @throws SQLException
	 */
	public Participant findParticipant(int id) throws SQLException {

		try (Connection conn = getConn(); Statement query = conn.createStatement()) {
			try (ResultSet rs = query.executeQuery("SELECT * FROM participant WHERE id = " + id)) {

				rs.next();
				Participant participant = new Participant();
				participant.setId(rs.getInt("id"));
				participant.setCountry(countriesDao.findCountry(rs.getInt("country_id")));
				participant.setName(rs.getString("name"));
				participant.setSong(rs.getString("song"));
				participant.setYear(rs.getInt("year"));
				participant.setSong_link(rs.getString("song_link"));
				participant.setLanguage(rs.getString("language"));
				participant.setGala(galaParticipantDao.findByParticipant(participant.getId()).get(0));

				return participant;
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

	/**
	 * 
	 * @return Select all data from Participant table without gala
	 * @throws SQLException
	 */
	public List<Participant> findOnlyParticipants() throws SQLException {

		try (Connection conn = getConn(); Statement query = conn.createStatement()) {
			try (ResultSet rs = query.executeQuery("SELECT * FROM participant")) {
				List<Participant> participants = new ArrayList<>();

				while (rs.next()) {
					Participant participant = new Participant();
					participant.setId(rs.getInt("id"));
					participant.setCountry(countriesDao.findCountry(rs.getInt("country_id")));
					participant.setName(rs.getString("name"));
					participant.setSong(rs.getString("song"));
					participant.setYear(rs.getInt("year"));
					participant.setSong_link(rs.getString("song_link"));
					participant.setLanguage(rs.getString("language"));
					participants.add(participant);
				}

				return participants;
			}
		}
	}
}
