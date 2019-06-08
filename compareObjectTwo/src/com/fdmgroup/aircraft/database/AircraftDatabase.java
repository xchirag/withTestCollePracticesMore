package com.fdmgroup.aircraft.database;

import java.util.List;

import com.fdmgroup.aircraft.model.Aircraft;

public interface AircraftDatabase {

	public void addAircraftInList(Aircraft newlyBought);
	public void removeAirCraftFromList (int index);
	public Aircraft getAirCraftbyId (int id);
	public List<Aircraft> getAllAirCrafts ();
}
