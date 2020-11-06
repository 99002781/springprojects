package com.sportsapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sportsapp.dao.SportRepository;
import com.sportsapp.exceptions.SportNotFoundException;
import com.sportsapp.model.Sports;

@Service
public class SportServiceImpl implements SportService{
	
	@Autowired
	SportRepository sportRepository;

	@Override
	public List<Sports> getAllSports() {
		// TODO Auto-generated method stub
		return sportRepository.findAll();
	}

	@Override
	public List<Sports> getByStadiumName(String stadiumName) throws SportNotFoundException {
		// TODO Auto-generated method stub
		List<Sports> sportList=sportRepository.getByStadiumName(stadiumName);
		if( sportList.isEmpty()) {
			throw new SportNotFoundException("book not available");
		}
		return sportList;
	}

	@Override
	public List<Sports> getBySportName(String sportName) throws SportNotFoundException {
		List<Sports> sportList=sportRepository.getByStadiumName(sportName);
		if( sportList.isEmpty()) {
			throw new SportNotFoundException("sport not available");
		}
		return sportList;
	}

	@Override
	public Sports getSportById(Integer sportsId) throws SportNotFoundException {
		return sportRepository.findById(sportsId)
				.orElseThrow(()->new SportNotFoundException("ID not available"));
		
	}

	@Override
	public Sports add(Sports sport) {
		Sports newsport= sportRepository.save(sport);
		return newsport;
	}

	@Override
	public Sports updateSports(Sports sport) {
		// TODO Auto-generated method stub
		return sportRepository.save(sport);
	}

	@Override
	public boolean deleteSports(Integer sportsId) throws SportNotFoundException {
		sportRepository.deleteById(sportsId);
		return true;
	}
	
	

}
