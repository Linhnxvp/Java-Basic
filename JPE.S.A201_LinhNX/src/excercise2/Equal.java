package excercise2;

import java.util.Scanner;

public class Equal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int one, two, three, four;
		
		System.out.println("Input the first number: ");
		one = sc.nextInt();
		
		System.out.println("Input the second number: ");
		two = sc.nextInt();
		
		System.out.println("Input the third number: ");
		three = sc.nextInt();
		
		System.out.println("Input the fourth number: ");
		four = sc.nextInt();
		
		if(one == two && one == three && one == four) {
			System.out.println("Numbers are equal");
		}else {
			System.out.println("Numbers are not equal");
		}
	}
}
