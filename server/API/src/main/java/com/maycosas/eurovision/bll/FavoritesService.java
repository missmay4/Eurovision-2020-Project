package com.maycosas.eurovision.bll;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maycosas.eurovision.dal.FavoritesDao;
import com.maycosas.eurovision.entities.Favorites;

@Service
public class FavoritesService {

	@Autowired
	private FavoritesDao fdao;
	
	/**
	 * Save the favorites
	 * @param fav
	 * @throws SQLException
	 */
	public int saveFavorites(Favorites fav) throws SQLException {
		return fdao.saveFavorites(fav);
	}
	
	/**
	 * @return list with all the favorites
	 * @throws SQLException
	 */
	public List<Favorites> getFavorites() throws SQLException {
		return fdao.findAllFavorites();
	}
	
}
