package com.maycosas.eurovision.entities;

public class Participant {

	private int id;
	private int year;
	private Country country;
	private String name;
	private String song;
	private String language;
	private String song_link;
	private GalaParticipant gala; 

	public GalaParticipant getGala() {
		return gala;
	}

	public void setGala(GalaParticipant gala) {
		this.gala = gala;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getSong_link() {
		return song_link;
	}

	public void setSong_link(String song_link) {
		this.song_link = song_link;
	}

}
