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

import com.maycosas.eurovision.entities.RegisteredUser;

@Repository
public class RegisteredUserDao {

	@Autowired
	private FavoritesDao favDao;

	public int createRegisteredUser(RegisteredUser user) throws SQLException {
		String sql = "INSERT INTO registered_user (user_name, user_pass) values (?, ?)";
		int id = 0;

		try (Connection conn = getConn();
				PreparedStatement query = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			query.setString(1, user.getUsername());
			query.setString(2, user.getUserpass());

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

	public List<RegisteredUser> findRegisteredUsers() throws SQLException {

		try (Connection conn = getConn(); Statement query = conn.createStatement()) {
			try (ResultSet rs = query.executeQuery("SELECT * FROM registered_user")) {
				List<RegisteredUser> users = new ArrayList<>();

				while (rs.next()) {
					RegisteredUser user = new RegisteredUser();
					user.setId(rs.getInt("id"));
					user.setUsername(rs.getString("user_name"));
					user.setUserpass(rs.getString("user_pass"));
					user.setFavorites(favDao.findFavoritesUser(user.getId()));

					users.add(user);
				}

				return users;
			}
		}

	}

	public RegisteredUser findRegisteredUser(int user_id) throws SQLException {
		try (Connection conn = getConn(); Statement query = conn.createStatement()) {
			try (ResultSet rs = query.executeQuery("SELECT * FROM registered_user WHERE id = " + user_id)) {
				rs.next();
				RegisteredUser user = new RegisteredUser();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("user_name"));
				user.setUserpass(rs.getString("user_pass"));
				user.setFavorites(favDao.findFavoritesUser(user.getId()));

				return user;

			}

		}
	}

	public RegisteredUser findRegisteredUserName(String name) throws SQLException {
		String sql = "SELECT * FROM registered_user where user_name = ?";
		try (Connection conn = getConn();
				PreparedStatement query = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

			query.setString(1, name);
			try (ResultSet rs = query.executeQuery()) {

				if (rs.next()) {
					RegisteredUser user = new RegisteredUser();
					user.setUsername(name);

					return user;
				} else {
					return null;
				}

			}
		}
	}
	
	public RegisteredUser findRegisteredPassword(String password) throws SQLException {
		String sql = "SELECT * FROM registered_user where user_pass = ?";
		try (Connection conn = getConn();
				PreparedStatement query = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

			query.setString(1, password);
			try (ResultSet rs = query.executeQuery()) {

				if (rs.next()) {
					RegisteredUser user = new RegisteredUser();
					user.setUserpass(password);

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
