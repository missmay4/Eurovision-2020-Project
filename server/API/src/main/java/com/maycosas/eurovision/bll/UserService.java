package com.maycosas.eurovision.bll;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maycosas.eurovision.dal.UserDao;
import com.maycosas.eurovision.entities.User;

@Service
public class UserService {

	@Autowired
	private UserDao dao;

	/**
	 * @return list with all users
	 * @throws SQLException
	 */
	public List<User> getAllUsers() throws SQLException {

		return dao.findAllUsers();
	}

	/**
	 * 
	 * @param user_id
	 * @return specific user by id
	 * @throws SQLException
	 */
	public User getUser(int user_id) throws SQLException {
		return dao.findUser(user_id);
	}

	/**
	 * 
	 * @param name
	 * @return username from users with votes
	 * @throws SQLException
	 */
	public User getUserName(String name) throws SQLException {
		return dao.findUserName(name);
	}

	/**
	 * 
	 * @param name
	 * @return new user for votes
	 * @throws SQLException
	 */
	public User createUser(String name) throws SQLException {
		User user = new User();
		user.setName(name);
		dao.createUser(user);

		return user;
	}

}
