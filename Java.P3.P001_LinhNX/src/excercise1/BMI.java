package excercise1;

import java.util.Scanner;

public class BMI {
	public void calculateBMI(double weight, double height) {
		int Enum;
		double result = weight/(height*height/10000);
		if(result<19) {
			Enum = 1;
		}else if(result >=19 & result<25) {
			Enum = 2;
		}else if(result >=25 & result<30) {
			Enum = 3;
		}else if(result >=30 & result<40) {
			Enum = 4;
		}else {
			Enum = 5;
		}	
		
		System.out.println("BMI Number: "+result);
		System.out.print("BMI Status: ");
		switch(Enum){
			case 1:
				System.out.println("Below standard");
				break;
			case 2:
				System.out.println("Standard");
				break;
			case 3:
				System.out.println("Overweight");
				break;
			case 4:
				System.out.println("Fat");
				break;
			case 5:
				System.out.println("Very Fat");
				break;
		}
	}
	
	public Double checkIn(String inputVal) {
		boolean isNum = false;
		do {
			isNum = inputVal.matches("[0-9]+[\\.]?[0-9]*");
			if(isNum) {
				return Double.parseDouble(inputVal);
			}else {
				System.out.println("BMI is digit");
				return null;
			}
		}while(isNum=false);
		
	}
	
}
