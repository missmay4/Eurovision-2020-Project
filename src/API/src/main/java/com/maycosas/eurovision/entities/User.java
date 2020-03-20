package com.maycosas.eurovision.entities;

import java.util.ArrayList;

public class User {
	
	private int id; 
	private String name;
	private ArrayList<Vote> votes = new ArrayList<Vote>();
	
	public ArrayList<Vote> getVotos() {
		return votes;
	}
	public void setVotos(ArrayList<Vote> votos) {
		this.votes = votos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	
	

}
