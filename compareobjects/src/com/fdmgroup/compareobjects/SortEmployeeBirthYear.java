package com.fdmgroup.compareobjects;

import java.util.Comparator;

public class SortEmployeeBirthYear implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmployeeBirthYear() - o2.getEmployeeBirthYear();
		// Younger comes first
	}

}
