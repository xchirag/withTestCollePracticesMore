package com.fdmgroup.compareobjects;

import java.util.Comparator;

import com.fdmgroup.aircraft.model.Aircraft;

public class AircraftSortByFuelCapacity implements Comparator<Aircraft>{

	@Override
	public int compare(Aircraft o1, Aircraft o2) {
		return o2.getFuelCapacity() - o1.getFuelCapacity();
	}
	
	

}
