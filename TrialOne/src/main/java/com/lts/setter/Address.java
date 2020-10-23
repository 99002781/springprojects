package com.lts.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	String city;
	String State;
	public String getCity() {
		return city;
	}
	@Value("${employee.address.city}")
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	@Value("${employee.address.state}")
	public void setState(String state) {
		State = state;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", State=" + State + "]";
	}

}
