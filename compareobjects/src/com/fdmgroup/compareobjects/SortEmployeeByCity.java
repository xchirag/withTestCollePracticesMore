package com.fdmgroup.compareobjects;

import java.util.Comparator;

public class SortEmployeeByCity implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		//return 0;
		
		String temp1 = o1.getCity();
		String temp2 = o2.getCity();
		
		return temp1.compareTo(temp2);
		//order by ascending with city A - Z 
		//this opposite with what was implmenented in SortEmployeeByName
	}
	

}
