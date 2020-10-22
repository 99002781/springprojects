package com.hotelapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hotelapp.model.Hotel;
import com.hotelapp.service.HotelService;

@RestController
public class HotelController {
	@Autowired
	HotelService hotelservice;
	@GetMapping("/hotels")
	public List<Hotel>showAllHotels(){
		return hotelservice.getAllHotels();
	}
	@GetMapping("hotels-by-city/{city}")
	public List<Hotel>showHotelByCity(@PathVariable("city")String city){
		return hotelservice.getbycity(city);
	}
	@GetMapping("hotels-by-cuisine/{cuisine}")
	public List<Hotel>showHotelByCuisine(@PathVariable("cuisine")String cuisine){
		return hotelservice.getByCuisine(cuisine);
	}
	@GetMapping("/hotel-by-id/{hotelID}")
	public Hotel showhotelById(@PathVariable("hotelID")int hotelID){
		return hotelservice.getById(hotelID);
	}
	
}
