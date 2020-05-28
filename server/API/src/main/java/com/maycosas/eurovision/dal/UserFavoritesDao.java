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

import com.maycosas.eurovision.entities.UserFavorites;

@Repository
public class UserFavoritesDao {

	@Autowired
	private FavoritesDao favDao;

	public int createUserFavorites(UserFavorites user) throws SQLException {
		String sql = "INSERT INTO user_favorites (user_name, user_country) values (?, ?)";
		int id = 0;

		try (Connection conn = getConn();
				PreparedStatement query = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			query.setString(1, user.getUsername());
			query.setString(2, user.getCountry());

			int rows = query.executeUpdate();

			if (rows > 0) {
				ResultSet rs = query.getGeneratedKeys();
				if (rs.next()) {
					id = rs.getInt(1);
					user.setId(id);
				}

			}
		}
		return id;

	}

	public List<UserFavorites> findUsersFavorites() throws SQLException {

		try (Connection conn = getConn(); Statement query = conn.createStatement()) {
			try (ResultSet rs = query.executeQuery("SELECT * FROM user_favorites")) {
				List<UserFavorites> users = new ArrayList<>();

				while (rs.next()) {
					UserFavorites user = new UserFavorites();
					user.setId(rs.getInt("id"));
					user.setUsername(rs.getString("user_name"));
					user.setCountry(rs.getString("user_country"));
					user.setFavorites(favDao.findFavoritesUser(user.getId()));

					users.add(user);
				}

				return users;
			}
		}

	}

	public UserFavorites findUserFavorites(int user_id) throws SQLException {
		try (Connection conn = getConn(); Statement query = conn.createStatement()) {
			try (ResultSet rs = query.executeQuery("SELECT * FROM user_favorites WHERE id = " + user_id)) {
				rs.next();
				UserFavorites user = new UserFavorites();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("user_name"));
				user.setCountry(rs.getString("user_country"));
				user.setFavorites(favDao.findFavoritesUser(user.getId()));

				return user;

			}

		}
	}

	public UserFavorites findUserFavoritesUsername(String name) throws SQLException {
		String sql = "SELECT * FROM user_favorites where user_name = ?";
		try (Connection conn = getConn();
				PreparedStatement query = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

			query.setString(1, name);
			try (ResultSet rs = query.executeQuery()) {

				if (rs.next()) {
					UserFavorites user = new UserFavorites();
					user.setUsername(name);

					return user;
				} else {
					return null;
				}

			}
		}
	}
	
	public UserFavorites findUserFavoritesCountry(String country) throws SQLException {
		String sql = "SELECT * FROM user_favorites where user_country = ?";
		try (Connection conn = getConn();
				PreparedStatement query = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

			query.setString(1, country);
			try (ResultSet rs = query.executeQuery()) {

				if (rs.next()) {
					UserFavorites user = new UserFavorites();
					user.setCountry(country);

					return user;
				} else {
					return null;
				}

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
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/eurovision2020", "postgres",
					"1234");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;

	}

}
