package excercise2;

import java.util.Scanner;

public class Country {
	protected String countryCode;
	protected String countryName;
	protected float totalArea;
	public Country() {
		
	}
	public Country(String countryCode, String countryName, float totalArea) {
		super();
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.totalArea = totalArea;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public float getTotalArea() {
		return totalArea;
	}
	public void setTotalArea(float totalArea) {
		this.totalArea = totalArea;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void input() {
		System.out.print("Country code: ");
		countryCode = sc.nextLine();
		System.out.print("\nCountry name: ");
		countryName = sc.nextLine();
		System.out.print("\nTotal area: ");
		totalArea = sc.nextFloat();
	}
	
	public void display() {
		System.out.print("Country code \tCountry name \tTotal area");
	}
	
}
