package com.hotelapp.model;

public class Hotel {
	String hotelName;
	Integer hotelID;
	String city;
	String cuisine;
	
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(String hotelName, Integer hotelID, String city, String cuisine) {
		super();
		this.hotelName = hotelName;
		this.hotelID = hotelID;
		this.city = city;
		this.cuisine = cuisine;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public Integer getHotelID() {
		return hotelID;
	}
	public void setHotelID(Integer hotelID) {
		this.hotelID = hotelID;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", hotelID=" + hotelID + ", city=" + city + ", cuisine=" + cuisine
				+ "]";
	}
	

}
