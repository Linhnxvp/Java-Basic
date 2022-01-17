package excercise;

import java.util.Scanner;

public class CircleExercise {
	public static void main(String[] args) {
		double r;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius : ");
		r = sc.nextDouble();
		System.out.println("Perimeter is = " + (2*Math.PI*r));
		System.out.println("Area is = "+ (Math.PI*r*r));
	}
}
