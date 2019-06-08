package com.fdmgroup.compareobjects;

import java.util.Comparator;
import java.util.Iterator;

public class SortEmployeeNameAndBirthYear implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		String s1 = o1.getEmployeeName();
		String s2 = o2.getEmployeeName();
		
		if (s1.compareTo(s2) == 0)
			return o1.getEmployeeBirthYear() - o2.getEmployeeBirthYear();
		return s1.compareTo(s2);
	
	}

}
