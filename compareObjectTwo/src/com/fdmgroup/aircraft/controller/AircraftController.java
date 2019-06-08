package com.fdmgroup.aircraft.controller;

import java.util.List;

import com.fdmgroup.aircraft.model.Aircraft;

public interface AircraftController {

	public void addAircraftInListofDatabase(Aircraft newlyBought);
	public void removeAirCraftFromListofDatabase (int index);
	public Aircraft getAirCraftbyIdfromDatabase (int id);
	public List<Aircraft> getAllAirCraftsofDatabase ();
}
