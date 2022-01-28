package excercise.ifelse;

import java.util.Scanner;

public class CheckPassFail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value for number: ");
		int mark = sc.nextInt();
		
		System.out.println("The mark is "+mark);
		
		//if- else statement
		if(mark>=50) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		System.out.println("------------------");
		System.out.println("CHECK DONE");
	}
}
