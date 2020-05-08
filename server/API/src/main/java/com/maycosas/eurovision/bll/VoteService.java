package com.maycosas.eurovision.bll;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maycosas.eurovision.dal.VoteDao;
import com.maycosas.eurovision.entities.Vote;

@Service
public class VoteService {

	@Autowired
	private VoteDao dao;

	/**
	 * Metodo para guardar los votos 
	 * @param vote
	 * @throws SQLException
	 */
	public int saveVote(Vote vote) throws SQLException {
		return dao.saveVote(vote);

	}

}