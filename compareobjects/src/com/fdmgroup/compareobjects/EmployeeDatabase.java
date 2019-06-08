package com.fdmgroup.compareobjects;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDatabase {
	
	private List<Employee> empDatabase; 
	
	public EmployeeDatabase(){
		empDatabase = new ArrayList<Employee>();
	}
	
	public List<Employee> addEmployee(){
		
		empDatabase.add(new Employee(2, "Pinky", 1970, "New York"));
		empDatabase.add(new Employee(1, "Ankur", 1986, "London"));
		empDatabase.add(new Employee(3, "Ankur", 1983, "Paris"));
		empDatabase.add(new Employee(4, "Charlie", 1977, "Philadelphia"));
		empDatabase.add(new Employee(7, "Bikaner", 1983, "Rajkot"));
		empDatabase.add(new Employee(15, "Webdesi", 1996, "London"));
		empDatabase.add(new Employee(6, "Pawli", 2010, "New Jersey"));
		
		return empDatabase;
	}
	
	// try linked list and other collections as well

}
