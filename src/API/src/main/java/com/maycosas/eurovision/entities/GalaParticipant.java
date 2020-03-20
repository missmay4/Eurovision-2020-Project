package com.maycosas.eurovision.entities;

public class GalaParticipant {

	private int id;
	private int gala_id;
	private int participant_id;
	private int points;
	private int performanceOrder;

	public int getPerformanceOrder() {
		return performanceOrder;
	}

	public void setPerformanceOrder(int performanceOrder) {
		this.performanceOrder = performanceOrder;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGala_id() {
		return gala_id;
	}

	public void setGala_id(int gala_id) {
		this.gala_id = gala_id;
	}

	public int getParticipant_id() {
		return participant_id;
	}

	public void setParticipant_id(int participant_id) {
		this.participant_id = participant_id;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

}
