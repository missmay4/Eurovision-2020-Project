package com.maycosas.eurovision.bll;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maycosas.eurovision.dal.CountryDao;
import com.maycosas.eurovision.entities.Country;

@Service
public class CountryService {

	@Autowired
	private CountryDao dao;

	/**
	 * 
	 * @return list with all the Countries
	 * @throws SQLException
	 */
	public List<Country> getAllCountries() throws SQLException {

		return dao.findAllCountries();
	}

	/**
	 * 
	 * @param country_id
	 * @return specific Country
	 * @throws SQLException
	 */
	public Country getCountry(int country_id) throws SQLException {
		return dao.findCountry(country_id);
	}
}
