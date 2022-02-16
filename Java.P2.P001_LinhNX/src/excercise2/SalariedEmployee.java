package excercise2;

import java.util.Scanner;

public class SalariedEmployee extends Employee implements Payable {
	private double commisstionRate;
	private double grossSales;
	private double basicSalary;
	
	public SalariedEmployee() {
		
	}
	
	public SalariedEmployee(String ssn, String firstName, String lastName, String birthDate, String phone,
			String email, double commisstionRate, double grossSales, double basicSalary) {
		super(ssn, firstName, lastName, birthDate, phone, email);
		this.commisstionRate = commisstionRate;
		this.grossSales = grossSales;
		this.basicSalary = basicSalary;
	}

	public double getCommisstionRate() {
		return commisstionRate;
	}


	public void setCommisstionRate(double commisstionRate) {
		this.commisstionRate = commisstionRate;
	}


	public double getGrossSales() {
		return grossSales;
	}


	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}


	public double getBasicSalary() {
		return basicSalary;
	}


	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public void setInfoSalaried() {
		Scanner sc = new Scanner(System.in);
		super.setInfo();
		System.out.print("\nEnter commisstion rate: ");
		commisstionRate = sc.nextDouble();
		System.out.print("\nEnter gross sales: ");
		grossSales = sc.nextDouble();
		System.out.print("\nEnter basic salary: ");
		basicSalary = sc.nextDouble();
	}

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return basicSalary + (grossSales*commisstionRate);
	}

	@Override
	public String toString() {
		return "SalariedEmployee ["+super.toString()+"commisstionRate=" + commisstionRate + ", grossSales=" + grossSales + ", basicSalary="
				+ basicSalary ;
	}


	
	
}
