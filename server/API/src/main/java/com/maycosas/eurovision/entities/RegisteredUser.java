package com.maycosas.eurovision.entities;

import java.util.ArrayList;

public class RegisteredUser {
	private int id;
	private String username;
	private String userpass;
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
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	public ArrayList<Favorites> getFavorites() {
		return favorites;
	}
	public void setFavorites(ArrayList<Favorites> favorites) {
		this.favorites = favorites;
	}

}
