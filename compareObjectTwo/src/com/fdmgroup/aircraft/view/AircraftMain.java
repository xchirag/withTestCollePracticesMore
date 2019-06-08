package com.fdmgroup.aircraft.view;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.fdmgroup.aircraft.controller.AircraftController;
import com.fdmgroup.aircraft.controller.AircraftControllerImpl;
import com.fdmgroup.aircraft.model.Aircraft;
import com.fdmgroup.compareobjects.AircarftSortByYearBought;
import com.fdmgroup.compareobjects.AircraftSortByAircraftId;
import com.fdmgroup.compareobjects.AircraftSortByFuelCapacity;

public class AircraftMain {

	public static void main(String[] args) {

		AircraftSortByAircraftId aircraftView = new AircraftSortByAircraftId();
		AircraftController airControl = new AircraftControllerImpl();
		
		Aircraft newlyBought = new Aircraft(1, "Boeing", 1990, 28, 15000);
		Aircraft newlyBought2 = new Aircraft(2, "AirIndia", 2010, 8, 35000);
		Aircraft newlyBought3 = new Aircraft(3, "AirDubai", 2018, 1, 57000);
		airControl.addAircraftInListofDatabase(newlyBought2);
		airControl.addAircraftInListofDatabase(newlyBought2);
		airControl.addAircraftInListofDatabase(newlyBought);
		airControl.addAircraftInListofDatabase(newlyBought3);
		airControl.addAircraftInListofDatabase(newlyBought);
		//System.out.println(aircraftView.getAirCraftbyIdfromDatabase(0).toString());
		
		//System.out.println(aircraftView.getAirCraftbyIdfromDatabase(0).toString());
		
		Aircraft temp = airControl.getAirCraftbyIdfromDatabase(0);
		System.out.println(temp.toString());
		System.out.println(airControl.getAirCraftbyIdfromDatabase(1).toString());
		
		List<Aircraft> listOfair = airControl.getAllAirCraftsofDatabase();
		System.out.println("via list as under:");
		for (Aircraft aircraft : listOfair) {
			System.out.println(aircraft.toString());
		}
		
//		Aircraft temp2 = aircraftView.getAirCraftbyIdfromDatabase(1);
//		System.out.println(temp2.toString());
//		
		System.out.println("pinging as ID: ");
		AircraftSortByAircraftId airView = new AircraftSortByAircraftId();
		Collections.sort(listOfair, new AircraftSortByAircraftId()); // this sort method can be used as under as well!
		
		for (Aircraft aircraft : listOfair) {
			System.out.println(aircraft.toString());
		}
		
		
		System.out.println("pinging as YearBoughtIn: ");
		AircarftSortByYearBought sortByYear = new AircarftSortByYearBought();
		Collections.sort(listOfair, sortByYear);
		
		for (Aircraft aircraft : listOfair) {
			System.out.println(aircraft.toString());
		}
		
		System.out.println("pinging as SortByFuelCapacity: ");
		AircraftSortByFuelCapacity sortByfuel = new AircraftSortByFuelCapacity();
		Collections.sort(listOfair, sortByfuel);
		
		for (Aircraft aircraft : listOfair) {
			System.out.println(aircraft.toString());
		}
	}
}
