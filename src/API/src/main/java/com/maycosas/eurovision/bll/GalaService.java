package com.maycosas.eurovision.bll;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maycosas.eurovision.dal.GalaDao;
import com.maycosas.eurovision.entities.Gala;

@Service
public class GalaService {

	@Autowired
	private GalaDao galaDao;

	public ArrayList<Gala> getAll() throws SQLException {

		return galaDao.findAll();

	}

}
