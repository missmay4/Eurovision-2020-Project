package com.maycosas.eurovision.bll;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maycosas.eurovision.dal.RegisteredUserDao;
import com.maycosas.eurovision.entities.RegisteredUser;

@Service
public class RegisteredUserService {
	@Autowired
	private RegisteredUserDao ruserDao;
	
	/**
	 * 
	 * @param username
	 * @param password
	 * @return devuelve el usuario creado
	 * @throws SQLException
	 */
	public RegisteredUser createRegisteredUser(String username, String password) throws SQLException {
		RegisteredUser user = new RegisteredUser();
		user.setUsername(username);
		user.setUserpass(password);
		
		ruserDao.createRegisteredUser(user);
		
		return user;
	}
	
	/**
	 * 
	 * @return devuelve una lista con todos los usuarios registrados
	 * @throws SQLException
	 */
	
	public List<RegisteredUser> getAllRegisteredUsers() throws SQLException {
		return ruserDao.findRegisteredUsers();
	}
	
	/**
	 * 
	 * @param user_id
	 * @return devuelve un usuario especifico introducido por id
	 * @throws SQLException
	 */
	public RegisteredUser getRegisteredUser(int user_id) throws SQLException {
		return ruserDao.findRegisteredUser(user_id);
	}
	
	/**
	 * 
	 * @param name
	 * @return devuelve el nombre de usuario de un usuario registrado
	 * @throws SQLException
	 */
	public RegisteredUser getRegisteredUsername(String username) throws SQLException {
		return ruserDao.findRegisteredUserName(username);
	}
	
	public RegisteredUser getRegisteredPassword(String password) throws SQLException {
		return ruserDao.findRegisteredPassword(password);
	}
	

}
