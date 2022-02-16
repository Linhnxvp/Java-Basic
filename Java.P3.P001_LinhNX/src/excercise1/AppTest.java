package excercise1;

import java.util.Scanner;

public class AppTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		NormalCalculator caculate = new NormalCalculator();
//		double a,b;
//		char operator;
//		do {
//			System.out.println("Enter number: ");
//			a = sc.nextDouble();
//			System.out.println("Enter Operator: ");
//			operator = sc.next().charAt(0);
//			System.out.println("Enter number: ");
//			b = sc.nextDouble();
//			System.out.println("Memory: ");
//			caculate.calculate(a, operator, b);
//			System.out.println("Enter Operator: ");
//			operator = sc.next().charAt(0);
//		}while(operator.equals("="));
		int choose;
		do {
			
		System.out.println("======= Calculator =========");
		System.out.println("1. Normal Calculator");
		System.out.println("2. BMI Calculator");
		System.out.println("3. Exit");
		
		System.out.print("Please choice one option: ");
		choose = sc.nextInt();
		
		switch(choose) {
			case 1:
				System.out.println("---- Normal Calculator -------");
				double numA,numB;
				String operator;
				NormalCalculator calculator = new NormalCalculator();
				
				System.out.print("Enter number:");
				numA = sc.nextDouble();
				
				do {
					do {
					System.out.print("\nEnter operator: ");
					operator = sc.next();
					}while(!calculator.checkOperator(operator));
					
					if(operator.equals("=")) {
						break;
					}
					
					System.out.print("\nEnter number: ");
					numB = sc.nextDouble();

					numA = calculator.calculate(numA, operator, numB);
					
					System.out.println("\nMemory: "+numA);

				}while(!operator.equals("="));
				System.out.println("Result: "+numA);
				
				
				break;
			case 2:
				System.out.println("---- BMI Calculator -------");
				BMI bmi = new BMI();
			
				String a,b;	
				do {	
					System.out.print("Enter Weight(kg):");
					a = sc.next();
				}while(bmi.checkIn(a)==null);
				
				do {
					System.out.print("Enter Height(cm):");
					b = sc.next();
				}while(bmi.checkIn(b)==null);
				
				double weight = Double.parseDouble(a);
				double height = Double.parseDouble(b);
				
				bmi.calculateBMI(weight, height);
				break;
			default:
				System.exit(0);
				break;
		}
		
		}while(choose!=0);
		
		
		
	}
}
