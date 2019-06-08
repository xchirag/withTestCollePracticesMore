package com.fdmgroup.compareobjects;

import java.util.Comparator;

import com.fdmgroup.aircraft.model.Aircraft;

public class AircarftSortByYearBought implements Comparator<Aircraft>{

	@Override
	public int compare(Aircraft o1, Aircraft o2) {
		return o1.getYearBought() - o2.getYearBought();
	}
	
}
