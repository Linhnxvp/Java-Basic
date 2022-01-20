package excercise3;

import java.util.Scanner;

public class Car {
	int speed;
	double regularPrice;
	String color;	 
	
	public Car(int speed, double regularPrice, String color) {
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}

	public double getSalePrice() {
		return regularPrice;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void setCarInfor() {
		System.out.println("Enter the speed: ");
		speed = sc.nextInt();
		System.out.println("Enter the regular price: ");
		regularPrice = sc.nextDouble();
		System.out.println("Enter the color: ");
		color = sc.next();
	}
	
	public void getCarInfo() {
		System.out.println("The speed: "+speed);
		System.out.println("The regular price: "+regularPrice);
		System.out.println("The color: "+color);
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getRegularPrice() {
		return regularPrice;
	}

	public void setRegularPrice(double regularPrice) {
		this.regularPrice = regularPrice;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

}
