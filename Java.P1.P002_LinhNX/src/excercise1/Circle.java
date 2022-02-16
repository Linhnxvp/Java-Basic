package excercise1;

import java.util.Scanner;

public class Circle extends Shape {

	private double radius;

	public Circle() {

	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}

	@Override
	public double getArea() {
		return Math.PI*radius*radius;
	}

	@Override
	public void printResult() {
		System.out.println("------Circle-----");
		System.out.println("Radius: "+radius);
		System.out.println("Area: "+getArea());
		System.out.println("Perimeter: "+getPerimeter());
	}

	public void setCircleInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input radius of Circle: ");
		radius = sc.nextDouble();
	}
}
