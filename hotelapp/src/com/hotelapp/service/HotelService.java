package com.hotelapp.service;

import java.util.List;
import com.hotelapp.model.Hotel;

public interface HotelService {
	 List<Hotel> getAllHotels();
	    List<Hotel> getbycity(String city);
	    List<Hotel> getByCuisine(String cuisine);
	    Hotel getById(int Id);

}
