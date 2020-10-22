package com.hotelapp.client;

import java.util.List;

import com.hotelapp.model.Hotel;
import com.hotelapp.service.HotelService;
import com.hotelapp.service.hotelserviceimpl;


public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HotelService service=new hotelserviceimpl();
		List<Hotel> hotellist= service.getAllHotels();
		for(Hotel hotel:hotellist)
			System.out.println(hotel);
			
	}

}
