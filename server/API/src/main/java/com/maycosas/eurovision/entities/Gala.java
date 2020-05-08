package com.maycosas.eurovision.entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Gala {
	private int id;

	public enum Type {
		Semifinal, Final
	};

	private Type type;
	private ArrayList<GalaParticipant> participants;

	public ArrayList<GalaParticipant> getParticipants() {
		return participants;
	}

	public void setParticipants(ArrayList<GalaParticipant> participants) {
		this.participants = participants;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	private LocalDate date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
