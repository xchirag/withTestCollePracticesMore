package com.fdmgroup.compareobjects;

import java.util.Comparator;
import java.util.List;

import com.fdmgroup.aircraft.database.AircraftDatabase;
import com.fdmgroup.aircraft.database.AircraftDatabaseImpl;
import com.fdmgroup.aircraft.model.Aircraft;

public class AircraftSortByAircraftId implements Comparator<Aircraft>{

	@Override
	public int compare(Aircraft o1, Aircraft o2) {
		// TODO Auto-generated method stub
		//return 0;
		return o1.getAircraftId() - o2.getAircraftId();
	}

//	private AircraftControllerImpl airCraftControl;
//
//	public AircraftControllerImpl getAirCraftControl() {
//		return airCraftControl;
//	}
//
//	public void setAirCraftControl(AircraftControllerImpl airCraftControl) {
//		this.airCraftControl = airCraftControl;
//	}
//
//	public AircraftView() {
//
//		airCraftControl = new AircraftControllerImpl();
////	}
//	
//	private AircraftDatabase airDaoImpl;
//	
//	public AircraftView(){
//		airDaoImpl = new AircraftDatabaseImpl();
//	}
//	
//	public Aircraft getAirCraftbyIdfromDatabase (int id){
//		return airDaoImpl.getAirCraftbyId(id);
//	}
//	
//	public List<Aircraft> getAllAirCraftsofDatabase() {
//		return airDaoImpl.getAllAirCrafts();
//	}
//	
}
