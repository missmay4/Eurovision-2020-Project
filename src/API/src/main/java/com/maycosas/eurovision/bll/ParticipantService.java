package com.maycosas.eurovision.bll;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maycosas.eurovision.dal.ParticipantDao;
import com.maycosas.eurovision.entities.Participant;

@Service
public class ParticipantService {

	@Autowired
	private ParticipantDao dao;

	public List<Participant> getAllParticipants() throws SQLException {

		return dao.findAllParticipant();
	}

}
