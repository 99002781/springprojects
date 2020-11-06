package com.sportsapp.service;

import java.util.List;


import com.sportsapp.exceptions.SportNotFoundException;
import com.sportsapp.model.Sports;

public interface SportService {
	List<Sports> getAllSports();

	List<Sports> getByStadiumName(String stadiumName) throws SportNotFoundException;
	List<Sports> getBySportName(String sportName) throws SportNotFoundException;
	Sports getSportById(Integer sportsId) throws SportNotFoundException;
	
	Sports add(Sports sport);
	Sports updateSports(Sports sport);
	boolean deleteSports (Integer sportsId) throws SportNotFoundException;
	


}
