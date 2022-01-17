package excercise;

import java.util.Scanner;

public class RectangleExercise {
	public static void main(String[] args) {
		double width,heigth;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the width: ");
		width = sc.nextDouble();
		System.out.println("Enter the heigth: ");
		heigth = sc.nextDouble();
		
		System.out.println("The area is "+width*heigth);
		System.out.println("The perimeter is "+2*(width+heigth));
	}
}
