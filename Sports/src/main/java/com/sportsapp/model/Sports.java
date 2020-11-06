package com.sportsapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="sport")
@TypeAlias("Sport")
public class Sports {
	@Id
	Integer sportsId;
	String stadiumName;
	String sportName;
	
	public Sports() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Sports(Integer sportsId, String stadiumName, String sportName) {
		super();
		this.sportsId = sportsId;
		this.stadiumName = stadiumName;
		this.sportName = sportName;
	}

	public Integer getSportsId() {
		return sportsId;
	}
	public void setSportsId(Integer sportsId) {
		this.sportsId = sportsId;
	}
	public String getStadiumName() {
		return stadiumName;
	}
	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}
	public String getsportName() {
		return sportName;
	}
	public void setsportName(String sportName) {
		this.sportName = sportName;
	}

	@Override
	public String toString() {
		return "Sports [sportsId=" + sportsId + ", stadiumName=" + stadiumName + ", sportName=" + sportName
				+ "]";
	}
	
	

}
