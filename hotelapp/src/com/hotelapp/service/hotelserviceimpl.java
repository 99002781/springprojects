package com.hotelapp.service;

import java.util.List;
import com.hotelapp.dao.hoteldao;
import com.hotelapp.dao.hoteldaoimpl;
import com.hotelapp.model.Hotel;

public class hotelserviceimpl implements HotelService {
	hoteldao hotelda=new hoteldaoimpl();
	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return hotelda.getAllHotels();
		
	}

	@Override
	public List<Hotel> getbycity(String city) {
		// TODO Auto-generated method stub
		return hotelda.getbycity(city);
	}

	@Override
	public List<Hotel> getByCuisine(String cuisine) {
		// TODO Auto-generated method stub
		return hotelda.getByCuisine(cuisine);
	}

	@Override
	public Hotel getById(int Id) {
		// TODO Auto-generated method stub
		return hotelda.getById(Id);
	}

}
