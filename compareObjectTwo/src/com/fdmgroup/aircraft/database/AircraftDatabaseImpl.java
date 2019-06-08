package com.fdmgroup.aircraft.database;

import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.aircraft.model.Aircraft;

public class AircraftDatabaseImpl implements AircraftDatabase{
	
	private List<Aircraft> listOfAircrafts;// = new ArrayList<>();
	
	public AircraftDatabaseImpl(){
		
		listOfAircrafts = new ArrayList<>();
	}
	
	public void addAircraftInList(Aircraft newlyBought){
		listOfAircrafts.add(newlyBought);
	}
	
	public void removeAirCraftFromList (int index) {
		listOfAircrafts.remove(index);
	}

	@Override
	public Aircraft getAirCraftbyId(int id) {
		// TODO Auto-generated method stub
		//return getAirCraftbyId(id);
		return listOfAircrafts.get(id);
	}

	@Override
	public List<Aircraft> getAllAirCrafts() {
		return listOfAircrafts;
	}
}
