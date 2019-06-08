package com.fdmgroup.aircraft.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.fdmgroup.aircraft.model.Aircraft;
import com.fdmgroup.compareobjects.AircarftSortByYearBought;
import com.fdmgroup.compareobjects.AircraftSortByAircraftId;

public class AircraftSortByYearBoughtTest {
	
	//@Mock
	private AircarftSortByYearBought target = new AircarftSortByYearBought();
	private AircraftSortByAircraftId airB = new AircraftSortByAircraftId();
	
//	@Mock
	List<Aircraft> mockListOfAirCrafts = new ArrayList<Aircraft>();
	

	@Test
	public void test_AirCraftReturnsInAscendingOrderByCompareMethod(){
		
		mockListOfAirCrafts.add(new Aircraft(1, "companyName", 2010, 15, 2345));
		mockListOfAirCrafts.add(new Aircraft(7, "baba", 2001, 10, 890));
		mockListOfAirCrafts.add(new Aircraft(8, "2baba", 2008, 210, 2890));
		//Collections.sort(mockListOfAirCrafts, target);
		
		int result = target.compare(mockListOfAirCrafts.get(0), mockListOfAirCrafts.get(1));
		
		//assertEquals(2001, mockListOfAirCrafts.get(0).getYearBought());
		//assertEquals(1, result);
		assertTrue(result>=1);
		
		result = target.compare(mockListOfAirCrafts.get(1), mockListOfAirCrafts.get(0));
		//assertFalse(result>=1);
		assertTrue(result<1);
		
		int result2 = airB.compare(mockListOfAirCrafts.get(1), mockListOfAirCrafts.get(2));
		assertTrue(result2<1);
		
	}

	//again mockito would not work with these kind of situations and therefore real objects used 
	// to compare the results

	public void test(){
		
	}
}
