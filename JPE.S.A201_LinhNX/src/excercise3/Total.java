package excercise3;

import java.util.Scanner;

public class Total {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int one, two, three, four, five, sum=0;
		
		System.out.println("Input the first number: ");
		one = sc.nextInt();
		
		System.out.println("Input the second number: ");
		two = sc.nextInt();
		
		System.out.println("Input the third number: ");
		three = sc.nextInt();
		
		System.out.println("Input the fourth number: ");
		four = sc.nextInt();
		
		System.out.println("Input the fifth number: ");
		five = sc.nextInt();
		
		sum = one + two + three + four + five;
		
		System.out.println("The sum is "+sum);
	}
	
}
