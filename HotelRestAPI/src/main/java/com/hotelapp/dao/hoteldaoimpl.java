package com.hotelapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hotelapp.model.Hotel;

@Service
public class hoteldaoimpl implements hoteldao {

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return ShowHotelList();
	}

	@Override
	public List<Hotel> getbycity(String city) {
		// TODO Auto-generated method stub
		List<Hotel> newBookList=new ArrayList<>();
		for(Hotel book:ShowHotelList()) {
			if(book.getCity().equals(city))
				newBookList.add(book);
		}
		return newBookList;
	}

	@Override
	public List<Hotel> getByCuisine(String cuisine) {
		// TODO Auto-generated method stub
		List<Hotel> newHotelList=new ArrayList<>();
		for(Hotel hotel:ShowHotelList()) {
			if(hotel.getCuisine().equals(cuisine))
				newHotelList.add(hotel);
		}
		return newHotelList;
	}

	@Override
	public Hotel getById(int Id) {
		// TODO Auto-generated method stub
		for(Hotel hotel:ShowHotelList()) {
			if(hotel.getHotelID()==Id)
				return hotel;
		}
		return null;
	}
	private List<Hotel> ShowHotelList(){
		return Arrays.asList(
				new Hotel("peacock",1,"Jagtial","Continental"),
				new Hotel("sitara",2,"Hyderabad","Indian"),
				new Hotel("foodchoice",3,"Jagtial","French")
				);
	}


}
