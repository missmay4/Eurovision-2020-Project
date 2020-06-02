package com.maycosas.eurovision.bll;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maycosas.eurovision.dal.UserFavoritesDao;
import com.maycosas.eurovision.entities.UserFavorites;

@Service
public class UserFavoritesService {
	@Autowired
	private UserFavoritesDao ruserDao;

	/**
	 * 
	 * @param username
	 * @param country
	 * @return new user for favorites
	 * @throws SQLException
	 */
	public UserFavorites createUserFavorites(String username, String country) throws SQLException {
		UserFavorites user = new UserFavorites();
		user.setUsername(username);
		user.setCountry(country);

		ruserDao.createUserFavorites(user);

		return user;
	}

	/**
	 * 
	 * @return list with all users with favorites
	 * @throws SQLException
	 */

	public List<UserFavorites> getAllUsersFavorites() throws SQLException {
		return ruserDao.findUsersFavorites();
	}

	/**
	 * 
	 * @param user_id
	 * @return specific user with favorites
	 * @throws SQLException
	 */
	public UserFavorites getUserFavorites(int user_id) throws SQLException {
		return ruserDao.findUserFavorites(user_id);
	}

	/**
	 * 
	 * @param username
	 * @return username from users with favorites
	 * @throws SQLException
	 */
	public UserFavorites getFavoritesUsername(String username) throws SQLException {
		return ruserDao.findUserFavoritesUsername(username);
	}

	/**
	 * 
	 * @param name
	 * @return country from users with favorites
	 * @throws SQLException
	 */
	public UserFavorites getFavoritesCountry(String country) throws SQLException {
		return ruserDao.findUserFavoritesCountry(country);
	}

}
