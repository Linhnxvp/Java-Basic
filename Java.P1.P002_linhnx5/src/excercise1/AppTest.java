package excercise1;

import java.util.Scanner;

public class AppTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		
		System.out.println("=========== Caculator Shape Programer=====");
		rectangle.setRectangleInfo();
		circle.setCircleInfo();
		triangle.setTriangleInfo();
		
		rectangle.printResult();
		circle.printResult();
		triangle.printResult();
		
	}
}
