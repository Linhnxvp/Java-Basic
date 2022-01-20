package excercise1;

import java.util.Scanner;

public class Rectangle extends Shape {

	private double width;
	private double length;
	
	public Rectangle() {
		
	}

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length= length;
	}

	@Override
	public double getPerimeter() {
		return (width + length)*2;
	}

	@Override
	public double getArea() {
		return width*length;
	}

	@Override
	public void printResult() {
		System.out.println("------Rectangle-----");
		System.out.println("Width: "+width);
		System.out.println("Height: "+length);
		System.out.println("Area: "+getArea());
		System.out.println("Perimeter: "+getPerimeter());
	}
	public void setRectangleInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input side width of Rectangle: ");
		width = sc.nextDouble();
		System.out.println("Please input side length of Rectangle: ");
		length = sc.nextDouble();
	}
}
