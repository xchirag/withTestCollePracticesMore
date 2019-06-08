package com.fdmgroup.compareobjects;
import java.util.Comparator;

public class Employee {//implements Comparable<Employee>{

	private int employeeId;
	private String employeeName;
	private int employeeBirthYear;
	private String city;
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeBirthYear() {
		return employeeBirthYear;
	}
	public void setEmployeeBirthYear(int employeeBirthYear) {
		this.employeeBirthYear = employeeBirthYear;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Employee(int employeeId, String employeeName, int employeeBirthYear, String city) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeBirthYear = employeeBirthYear;
		this.city = city;
	}
//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
	
}
