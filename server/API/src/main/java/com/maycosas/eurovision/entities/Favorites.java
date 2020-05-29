package com.maycosas.eurovision.entities;

public class Favorites {
	private int id;
	private int participant_id;
	private int user_id;
	Participant participant;

	public Favorites() {

	}

	public Favorites(int participant_id, int user_id) {
		this.participant_id = participant_id;
		this.user_id = user_id;
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

	public Participant getParticipant() {
		return participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

}
