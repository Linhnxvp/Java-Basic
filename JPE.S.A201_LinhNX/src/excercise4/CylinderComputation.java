package excercise4;

import java.util.Scanner;

public class CylinderComputation {
	 public static void main(String[] args) {
		 double radius, height, surfaceArea, baseArea, volume;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Input the radius: ");
		 radius = sc.nextDouble();
		 
		 System.out.println("Input the height: ");
		 height = sc.nextDouble();
		 
		 surfaceArea = 2*Math.PI*radius*height;
		 System.out.println("Surface area: "+surfaceArea);
		 
		 baseArea = Math.PI*radius*radius;
		 System.out.println("Base area: "+baseArea);
		 
		 volume = baseArea*height;
		 System.out.println("Volume: "+volume);
	 }
}
