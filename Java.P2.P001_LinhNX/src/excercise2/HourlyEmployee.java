package excercise2;

import java.util.Scanner;

public class HourlyEmployee extends Employee implements Payable {
	private double rate;
	private double workingHours;
	
	public HourlyEmployee() {
		
	}

	public HourlyEmployee(String ssn, String firstName, String lastName, String birthDate, String phone, 
			String email, double rate, double workingHours) {
		super(ssn, firstName, lastName, birthDate, phone, email);
		this.rate = rate;
		this.workingHours = workingHours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}

	public void setInfoHourly() {
		Scanner sc = new Scanner(System.in);
		super.setInfo();
		System.out.print("\nEnter rate: ");
		rate = sc.nextDouble();
		System.out.print("\nEnter working hours: ");
		workingHours = sc.nextDouble();
	}
	
	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return rate*workingHours;
	}

	@Override
	public String toString() {
		return "HourlyEmployee ["+super.toString()+"rate=" + rate + ", workingHours=" + workingHours;
	}


	
	
}
