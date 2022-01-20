package excercise;

import java.util.Scanner;

public class LogicalExercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first integer: ");
		int a = sc.nextInt();
		System.out.print("Enter the second  integer: ");
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println(a + " != "+ b);
			System.out.println(a + " > "+ b);
			System.out.println(a + " >= "+ b);
		}else if(a<b) {
			System.out.println(a + " != "+ b);
			System.out.println(a + " < "+ b);
			System.out.println(a + " <= "+ b);
		}else if(a==b) {
			System.out.println(a + " = "+ b);
		}
	}
}
