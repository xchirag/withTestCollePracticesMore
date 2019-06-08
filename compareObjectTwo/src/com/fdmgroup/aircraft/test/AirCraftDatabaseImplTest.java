package com.fdmgroup.aircraft.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.fdmgroup.aircraft.database.AircraftDatabaseImpl;
import com.fdmgroup.aircraft.model.Aircraft;

@RunWith(MockitoJUnitRunner.class)
public class AirCraftDatabaseImplTest {

	@InjectMocks
	private AircraftDatabaseImpl target;
	
	@Mock
	private List<Aircraft> mockListOfAircrafts;
	
	@Mock
	private Aircraft myBaloon;
	
	@Before
	public void setup(){
		
		//myBaloon = new Aircraft(123, "koiBhi", 2100, 20, 224452);
	}
	
	@Test
	public void test_getAirCraftbyIdReturns_anAircraftFromDatabaseAsPerId(){
		int id = 0;
		when(target.getAirCraftbyId(id)).thenReturn(myBaloon);
		assertEquals(myBaloon, target.getAirCraftbyId(id));
		
	}
	@Test
	public void test_getAllAirCraftsReturnsListSizeZero_whenAircraftListisEmpty(){
		assertEquals(0, target.getAllAirCrafts().size());
	}

	
	@Test
	public void test_getAllAirCraftsReturnsListSizeThree_whenThreeAircraftsAddedIntoTheDatabase(){
		Aircraft baloon = null;
		mockListOfAircrafts.add(baloon);
		mockListOfAircrafts.add(baloon);
		mockListOfAircrafts.add(baloon);
		
		when(target.getAllAirCrafts().size()).thenReturn(3);
		assertEquals(3, target.getAllAirCrafts().size());
		verify(mockListOfAircrafts, times(3)).add(null);
	}

	@Test
	public void test_removeAirCraftFromList_removesAnAircraftFromDatabaseAsPerId(){
		int id = 0;
		target.removeAirCraftFromList(id);
		verify(mockListOfAircrafts, times(1)).remove(id);
	}

	@Test
	public void test_addAircraftInList_addsAnAirCraftIntoListofDatabase(){
		Aircraft newlyBought = null;
		target.addAircraftInList(newlyBought);
		verify(mockListOfAircrafts, times(1)).add(newlyBought);
	}
}
