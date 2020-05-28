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

import com.maycosas.eurovision.entities.Favorites;

@Repository
public class FavoritesDao {

	@Autowired
	private ParticipantDao partDao;

	public List<Favorites> findAllFavorites() throws SQLException {
		try (Connection conn = getConn(); Statement query = conn.createStatement()) {
			try (ResultSet rs = query.executeQuery("SELECT * FROM favorites")) {
				List<Favorites> favorites = new ArrayList<>();

				while (rs.next()) {
					Favorites fav = new Favorites();
					fav.setId(rs.getInt("id"));
					fav.setParticipant_id(rs.getInt("participant_id"));
					fav.setUser_id(rs.getInt("user_id"));
					fav.setParticipant(partDao.findParticipant(rs.getInt("participant_id")));

					favorites.add(fav);
				}
				return favorites;
			}
		}
	}
	
	public ArrayList<Favorites> findFavoritesUser(int user_id) throws SQLException {
		ArrayList<Favorites> favorites = new ArrayList<Favorites>();
		String sql = "SELECT * FROM favorites WHERE user_id = ?";
		try (Connection conn = getConn(); PreparedStatement query = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			query.setInt(1, user_id);
			
			try(ResultSet rs = query.executeQuery()){
				while(rs.next()) {
					Favorites fav = new Favorites();
					fav.setId(rs.getInt("id"));
					fav.setParticipant_id(rs.getInt("participant_id"));
					fav.setUser_id(rs.getInt("user_id"));
					fav.setParticipant(partDao.findParticipant(rs.getInt("participant_id")));
					
					favorites.add(fav);
				}
				return favorites;
			}
		}
	}
	
	public int saveFavorites(Favorites favorite) throws SQLException {
		String sql = "INSERT INTO favorites (participant_id, user_id) values (?, ?)";
		int id = 0;
		
		try (Connection conn = getConn(); PreparedStatement query = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			query.setInt(1, favorite.getParticipant_id());
			query.setInt(2, favorite.getUser_id());
			
			int rows = query.executeUpdate();
			
			if (rows > 0) {
				try (ResultSet rs = query.getGeneratedKeys()){
					if (rs.next()) {
						id = rs.getInt(1);
						favorite.setId(id);
					}
					
				} catch (Exception e) {
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
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/eurovision2020", "postgres",
					"1234");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;

	}
}
