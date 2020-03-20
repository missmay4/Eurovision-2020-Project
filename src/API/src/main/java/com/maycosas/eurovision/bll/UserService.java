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
	 * @return devuelve una lista con todos los usuarios
	 * @throws SQLException
	 */
	public List<User> getAllUsers() throws SQLException {

		return dao.findAllUsers();
	}
	
	/**
	 * 
	 * @param user_id
	 * @return devuelve un usuario especifico introducido por id
	 * @throws SQLException
	 */
	
	public User getUser(int user_id) throws SQLException {
		return dao.findUser(user_id);
	}
	
	public User getUserName (String name) throws SQLException {
		return dao.findUserName(name);
	}
	
	public User createUser(String name) throws SQLException {
		User user = new User();
		user.setName(name);
		dao.createUser(user);
		
		return user;
	}

}
