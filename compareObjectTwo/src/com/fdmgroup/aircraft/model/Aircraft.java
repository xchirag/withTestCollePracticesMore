package com.fdmgroup.aircraft.model;

public class Aircraft {
	
	private int aircraftId;
	private String companyName;
	private int yearBought, yearsInService;
	private int fuelCapacity;
	public int getAircraftId() {
		return aircraftId;
	}
	
	public Aircraft(){
		
	}
	public void setAircraftId(int aircraftId) {
		this.aircraftId = aircraftId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getYearBought() {
		return yearBought;
	}
	public void setYearBought(int yearBought) {
		this.yearBought = yearBought;
	}
	public int getYearsInService() {
		return yearsInService;
	}
	public void setYearsInService(int yearsInService) {
		this.yearsInService = yearsInService;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public Aircraft(int aircraftId, String companyName, int yearBought, int yearsInService, int fuelCapacity) {
		super();
		this.aircraftId = aircraftId;
		this.companyName = companyName;
		this.yearBought = yearBought;
		this.yearsInService = yearsInService;
		this.fuelCapacity = fuelCapacity;
	}
	@Override
	public String toString() {
		return "Aircraft [aircraftId=" + aircraftId + ", companyName=" + companyName + ", yearBought=" + yearBought
				+ ", yearsInService=" + yearsInService + ", fuelCapacity=" + fuelCapacity + "]";
	}
	
	
	
}
