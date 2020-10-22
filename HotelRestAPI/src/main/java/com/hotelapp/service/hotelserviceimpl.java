package com.hotelapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelapp.dao.hoteldao;
import com.hotelapp.dao.hoteldaoimpl;
import com.hotelapp.model.Hotel;
@Service
public class hotelserviceimpl implements HotelService {
	@Autowired
	hoteldao hotelda;
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
