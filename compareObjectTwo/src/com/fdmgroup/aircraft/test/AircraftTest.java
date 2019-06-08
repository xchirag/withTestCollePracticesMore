package com.fdmgroup.aircraft.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.fdmgroup.aircraft.model.Aircraft;

@RunWith(MockitoJUnitRunner.class)
public class AircraftTest {
	
	@Mock
	private Aircraft target;
	
	Aircraft abc, dum;
	
	@Before
	public void setup(){
		
		abc = new Aircraft(15, "dum", 1954, 64, 800);
		dum = new Aircraft();

	}

	@Test
	public void test_afterSettingAirCraftIdbysetAircraftId_respectiveGetMethodReturnsSameValue(){
		
//		//target.setAircraftId(5);
//		when(target.getAircraftId()).thenReturn(5);
//		assertEquals(5, target.getAircraftId());
		
		target.setAircraftId(2);
		when(target.getAircraftId()).thenReturn(2);
		assertEquals(2, target.getAircraftId());
		verify(target, times(1)).setAircraftId(2);
	}


	@Test
	public void test_2 (){
		
		target.setFuelCapacity(2500);
		//when(target.getFuelCapacity()).thenReturn(2500);
		//assertEquals(expected, actual);
		//assertEquals(2500, target.getFuelCapacity());
		verify(target, times(1)).setFuelCapacity(2500);
		
		
	}
	//for the coverage purposes we have to create real object to test get and set methods
	//with the mock it will be tested but wont give any coverage!
	
	@Test
	public void test_d(){
		
		
		//abc.getAircraftId();
		
		assertEquals(15, abc.getAircraftId());
	}
	
	@Test
	public void test_e(){
		
		abc.setAircraftId(249);
		abc.setCompanyName("MyCompany");
		abc.setFuelCapacity(2345);
		abc.setYearBought(2000);
		abc.setYearsInService(5);
		assertEquals(249, abc.getAircraftId());
		assertEquals("MyCompany", abc.getCompanyName());
		assertEquals(2345, abc.getFuelCapacity());
		assertEquals(2000, abc.getYearBought());
		assertEquals(5, abc.getYearsInService());
		
	}
	
	//following works and tests but could not increase coverage via eclEmma!
	//therefore above added
	@Test
	public void test_tryWithMock(){
		
		String companyName = "Company Name";
		when(target.getCompanyName()).thenReturn(companyName);
		assertEquals(companyName, target.getCompanyName());
	}
	
}
