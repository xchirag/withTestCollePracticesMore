package com.fdmgroup.compareobjects;

import java.util.Comparator;

public class SortEmployeeByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		//return o1.getEmployeeName() - o2.getEmployeeName();
		
		String s1 = o1.getEmployeeName();
		String s2 = o2.getEmployeeName();
		
		return s2.compareTo(s1); // this will sort the objects in descending order by name
	}

}
