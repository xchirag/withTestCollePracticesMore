package com.fdmgroup.aircraft.test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.fdmgroup.aircraft.controller.AircraftControllerImpl;
import com.fdmgroup.aircraft.database.AircraftDatabase;
import com.fdmgroup.aircraft.model.Aircraft;

@RunWith(MockitoJUnitRunner.class)
public class AirCraftControllerImplTest {
	
	@InjectMocks
	private AircraftControllerImpl target;
	
	@Mock
	private AircraftDatabase mockDatabase;
	
	@Test
	public void test_addAircraftInListofDatabase_ofController_CallsaddAircraftInListofAircraftDatabase(){
		Aircraft newlyBought = null;
		target.addAircraftInListofDatabase(newlyBought);
		verify(mockDatabase, times(1)).addAircraftInList(newlyBought);
	}

	@Test
	public void test_removeAirCraftFromListofDatabase_callsRemoveAirCraftFromListofDatabase(){
		
		int index = 2;
		target.removeAirCraftFromListofDatabase(index);
		verify(mockDatabase, times(1)).removeAirCraftFromList(index);
	}

	@Test
	public void test_getAirCraftbyIdfromDatabase_callsGetAirCraftbyIdofDatabase(){
		
		int id = 0;
		target.getAirCraftbyIdfromDatabase(id );
		verify(mockDatabase, times(1)).getAirCraftbyId(id);
	}
	
	@Test
	public void test_getAllAirCraftsofDatabase_calls_getAllAirCraftsOfDatabase(){
		target.getAllAirCraftsofDatabase();
		verify(mockDatabase, times(1)).getAllAirCrafts();
	}

}
