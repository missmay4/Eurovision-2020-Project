package com.maycosas.eurovision.entities;

import java.util.ArrayList;

public class UserFavorites {
	private int id;
	private String username;
	private String country;
	private ArrayList<Favorites> favorites = new ArrayList<Favorites>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public ArrayList<Favorites> getFavorites() {
		return favorites;
	}
	public void setFavorites(ArrayList<Favorites> favorites) {
		this.favorites = favorites;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
