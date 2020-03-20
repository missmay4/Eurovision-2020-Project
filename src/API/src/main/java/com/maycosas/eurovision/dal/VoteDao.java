package com.maycosas.eurovision.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.maycosas.eurovision.entities.Vote;

@Repository
public class VoteDao {
	
	@Autowired
	private ParticipantDao partDao;

	public List<Vote> findAllVotes() throws SQLException {
		try (Connection conn = getConn(); Statement query = conn.createStatement()) {
			try (ResultSet rs = query.executeQuery("SELECT * FROM vote ORDER BY item_order ASC")) {
				List<Vote> votes = new ArrayList<>();

				while (rs.next()) {
					Vote vote = new Vote();
					vote.setId(rs.getInt("id"));
					vote.setParticipant_id(rs.getInt("participant_id"));
					vote.setUser_id(rs.getInt("user_id"));
					vote.setItem_order(rs.getInt("item_order"));
					vote.setGala_id(rs.getInt("gala_id"));
					vote.setDate(rs.getTimestamp("date_vote"));
					vote.setParticipant(partDao.findParticipant(rs.getInt("participant_id")));

					votes.add(vote);
				}

				return votes;
			}
		}
	}

	public ArrayList<Vote> findVoteUser(int user_id) throws SQLException {
		ArrayList<Vote> votes = new ArrayList<Vote>();
		String sql = "SELECT * FROM vote WHERE user_id = ? ORDER BY item_order ASC";
		try (Connection conn = getConn(); PreparedStatement query = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			
			query.setInt(1, user_id);
			
			try (ResultSet rs = query.executeQuery()) {
				while (rs.next()) {
					Vote vote = new Vote();
					vote.setId(rs.getInt("id"));
					vote.setParticipant_id(rs.getInt("participant_id"));
					vote.setUser_id(rs.getInt("user_id"));
					vote.setItem_order(rs.getInt("item_order"));
					vote.setGala_id(rs.getInt("gala_id"));
					vote.setDate(rs.getTimestamp("date_vote"));
					vote.setParticipant(partDao.findParticipant(rs.getInt("participant_id")));

					votes.add(vote);
				}

				return votes;

			}

		}
	}

	public int saveVote(Vote vote) throws SQLException {

		String sql = "INSERT INTO vote (participant_id, user_id, item_order, gala_id, date_vote) values (?, ?, ?, ?, ?)";
		int id = 0;
		
		try (Connection conn = getConn(); PreparedStatement query = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			query.setInt(1, vote.getParticipant_id());
			query.setInt(2, vote.getUser_id());
			query.setInt(3, vote.getItem_order());
			query.setInt(4, vote.getGala_id());
			query.setTimestamp(5, vote.getDate());
			
			int rows = query.executeUpdate();
			
			if (rows > 0) {
				try (ResultSet rs = query.getGeneratedKeys()){
					if (rs.next()) {
						id = rs.getInt(1);
						vote.setId(id);
					}
				} catch (SQLException e) {
					// TODO: handle exception
				}
			}

		}
		return id;
		
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
