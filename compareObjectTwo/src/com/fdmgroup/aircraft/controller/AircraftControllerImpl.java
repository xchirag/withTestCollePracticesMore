package com.fdmgroup.aircraft.controller;

import java.util.List;

import com.fdmgroup.aircraft.database.AircraftDatabase;
import com.fdmgroup.aircraft.database.AircraftDatabaseImpl;
import com.fdmgroup.aircraft.model.Aircraft;

public class AircraftControllerImpl implements AircraftController
{
	
	private AircraftDatabase airDaoImpl;
	
	public AircraftControllerImpl(){
		airDaoImpl = new AircraftDatabaseImpl();
	}
	

	public void addAircraftInListofDatabase(Aircraft newlyBought){
		airDaoImpl.addAircraftInList(newlyBought);
	}

	public void removeAirCraftFromListofDatabase (int index){
		airDaoImpl.removeAirCraftFromList(index);
	}
	
	public Aircraft getAirCraftbyIdfromDatabase (int id){
		return airDaoImpl.getAirCraftbyId(id);
	}
	public List<Aircraft> getAllAirCraftsofDatabase() {
		return airDaoImpl.getAllAirCrafts();
	}
	
}
