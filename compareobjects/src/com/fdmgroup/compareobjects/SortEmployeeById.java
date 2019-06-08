package com.fdmgroup.compareobjects;

import java.util.Comparator;

public class SortEmployeeById implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getEmployeeId() - e2.getEmployeeId();
		//above is sort by ascending order
		
		//following is sort by descending order
		//return e2.getEmployeeId() - e1.getEmployeeId();
	}
}
