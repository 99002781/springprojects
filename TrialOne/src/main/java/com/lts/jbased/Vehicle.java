package com.lts.jbased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Vehicle {
String vehiclename;
int vehicleId;
String brand;
public String getVehiclename() {
	return vehiclename;
}
@Value("city")
public void setVehiclename(String vehiclename) {
	this.vehiclename = vehiclename;
}
public int getVehicleId() {
	return vehicleId;
}
@Value("300")
public void setVehicleId(int vehicleId) {
	this.vehicleId = vehicleId;
}
public String getBrand() {
	return brand;
}
@Value("Honda")
public void setBrand(String brand) {
	this.brand = brand;
}
@Override
public String toString() {
	return "Vehicle [vehiclename=" + vehiclename + ", vehicleId=" + vehicleId + ", brand=" + brand + "]";
}


}
