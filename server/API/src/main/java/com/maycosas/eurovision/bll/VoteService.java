package com.maycosas.eurovision.bll;

import java.sql.SQLException;
import java.util.List;

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
	
	/**
	 * @return devuelve una lista con todos los votos
	 * @throws SQLException
	 */
	public List<Vote> getVotes() throws SQLException {
		return dao.getOnlyVotes();
	}

}