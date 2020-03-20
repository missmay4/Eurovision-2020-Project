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
import com.maycosas.eurovision.entities.User;

@Repository
public class UserDao {

	@Autowired
	private VoteDao voteDao;

	/**
	 * Metodo para crear usuarios
	 * 
	 * @param user
	 * @throws SQLException
	 */
	public int createUser(User user) throws SQLException {
		String sql = "INSERT INTO user_ (name) values (?)";
		int id = 0;

		try (Connection conn = getConn();
				PreparedStatement query = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			query.setString(1, user.getName());

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

	/**
	 * 
	 * @return Metodo que devuelve una lista de usuarios
	 * @throws SQLException
	 */
	public List<User> findAllUsers() throws SQLException {

		try (Connection conn = getConn(); Statement query = conn.createStatement()) {
			try (ResultSet rs = query.executeQuery("SELECT * FROM user_")) {
				List<User> users = new ArrayList<>();

				while (rs.next()) {
					User user = new User();
					user.setId(rs.getInt("id"));
					user.setName(rs.getString("name"));
					user.setVotos(voteDao.findVoteUser(user.getId()));

					users.add(user);
				}

				return users;
			}
		}
	}

	/**
	 * 
	 * @param user_id
	 * @return devuelve un usuario concreto segun el id
	 * @throws SQLException
	 */
	public User findUser(int user_id) throws SQLException {
		try (Connection conn = getConn(); Statement query = conn.createStatement()) {
			try (ResultSet rs = query.executeQuery("SELECT * FROM user_ WHERE id = " + user_id)) {
				rs.next();
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setVotos(voteDao.findVoteUser(user.getId()));

				return user;

			}

		}
	}

	public User findUserName(String name) throws SQLException {
		String sql = "SELECT * FROM user_ where name = ?";
		try (Connection conn = getConn();
				PreparedStatement query = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

			query.setString(1, name);
			try (ResultSet rs = query.executeQuery()) {

				if (rs.next()) {
					User user = new User();
					user.setName(name);

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
			connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/eurovision", "mayte", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;

	}

}
