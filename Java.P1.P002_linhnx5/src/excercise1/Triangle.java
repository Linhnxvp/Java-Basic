package excercise1;

import java.util.Scanner;

public class Triangle extends Shape {

	private double sideA;
	private double sideB;
	private double sideC;
	
	
	public Triangle(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public Triangle() {
	
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	@Override
	public double getPerimeter() {
		return sideA + sideB + sideC;
	}

	@Override
	public double getArea() {
		double p = getPerimeter()/2;
		return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
	}

	@Override
	public void printResult() {
		System.out.println("------Triangle-----");
		System.out.println("Side A: "+sideA);
		System.out.println("Side B: "+sideB);
		System.out.println("Side C: "+sideC);
		System.out.println("Area: "+getArea());
		System.out.println("Perimeter: "+getPerimeter());
	}
	
	public void setTriangleInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input side A of Triangle: ");
		sideA = sc.nextDouble();
		System.out.println("Please input side B of Triangle: ");
		sideB = sc.nextDouble();
		System.out.println("Please input side C of Triangle: ");
		sideC = sc.nextDouble();
	}

}
