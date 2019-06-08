package com.fdmgroup.compareobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class EmployeeMainViewMethod {

	public static void main(String[] args) {
		
		EmployeeDatabase emp = new EmployeeDatabase();
		//List<Employee> listE = new ArrayList<>();
		//listE = emp.addEmployee();
		//Arrays.sort(listE, new SortEmployeeBirthYear());
		//listE.sort(new SortEmployeeBirthYear());
		//Collections.sort((List<Employee>());
		//Collections.sort(listE, c);
		
		System.out.println("Employees Sorted as Birthyear as under :");
		
		List<Employee> listE = new ArrayList<>();
		listE = emp.addEmployee();
		
		Collections.sort(listE, new SortEmployeeBirthYear());
		
		ListIterator<Employee> le = listE.listIterator();
		
		displayEmployee(le);
		
		Collections.sort(listE, new SortEmployeeByCity());
		System.out.println("Employees Sorted as City as under :");
		
		le = listE.listIterator(0);
		
		//moves listIterator to a specific index in the list
		//ListIterator<Employee> leC = listE.listIterator();
		displayEmployee(le);
		
		Collections.sort(listE, new SortEmployeeByName());
		System.out.println("Employees Sorted as Name as under :");
		le = listE.listIterator(0);
		displayEmployee(le);
		
		Collections.sort(listE, new SortEmployeeById());
		System.out.println("Employees Sorted as ID as under :");
		le = listE.listIterator(0);
		displayEmployee(le);
		
		Collections.sort(listE, new SortEmployeeNameAndBirthYear());
		System.out.println("Employees Sorted as Name and then Birth Year as under :");
		le = listE.listIterator(0);
		displayEmployee(le);
	}

	private static void displayEmployee(ListIterator<Employee> le) {
		for (; le.hasNext();) {
			Employee employee = (Employee) le.next();
			System.out.print(employee.getEmployeeId() + " ");
			System.out.print(employee.getEmployeeName()+ " ");
			System.out.print(employee.getEmployeeBirthYear() + " ");
			System.out.print(employee.getCity()+ " ");
			System.out.println();
		}
		System.out.println();
	}

}
