package excercise1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Validate check = new Validate();
		
		String phone, email, date;
		
//		do {	
//			System.out.print("Enter phone:");
//			phone = sc.next();
//		}while(check.checkPhone(phone)==null);
//		
//		do {
//			System.out.print("Enter email:");
//			email = sc.next();
//		}while(check.checkEmail(email)==null);
//		
		do {
			System.out.print("Enter date:");
			date = sc.next();
		}while(check.checkDate(date)==null);
	}
}
