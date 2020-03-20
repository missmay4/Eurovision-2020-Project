package com.maycosas.eurovision.entities;

import java.sql.Timestamp;

public class Vote {
	private int id;
	private int participant_id;
	private int user_id;
	private int item_order;
	private int gala_id;
	private Timestamp date;
	Participant participant;
	
	public Participant getParticipant() {
		return participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

	public int getGala_id() {
		return gala_id;
	}

	public void setGala_id(int gala_id) {
		this.gala_id = gala_id;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp timestamp) {
		this.date = timestamp;
	}

	public Vote() {
		
	}

	public Vote(int participant_id, int user_id, int item_order, int gala, Timestamp date) {
		this.participant_id = participant_id;
		this.user_id = user_id;
		this.item_order = item_order;
		this.gala_id = gala;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getParticipant_id() {
		return participant_id;
	}

	public void setParticipant_id(int participant_id) {
		this.participant_id = participant_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getItem_order() {
		return item_order;
	}

	public void setItem_order(int item_order) {
		this.item_order = item_order;
	}

}
