package excercise2;

import java.util.Scanner;

public class Employee {
	String name;
	String last_name;
	double salary;
	
	
	
	public Employee(String name, String last_name, double salary) {
		super();
		this.name = name;
		this.last_name = last_name;
		if(salary<0) {
			this.salary=0.0;
		}else {
			this.salary = salary;
		}
	}

	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getLast_name() {
		return last_name;
	}



	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		if(salary<0) {
			this.salary=0.0;
		}else {
			this.salary = salary;
		}
	}



	public void getEmployeeInfo() {
		System.out.println("Name: "+name);
		System.out.println("Last name: "+last_name);
		System.out.println("Salary per year: "+salary*12*1.1);
	}
	
}
