package excercise2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayContains {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Nhập số phần tử của chuỗi: ");
		n = sc.nextInt();
		
		//Khai bao chuoi
		String[] stringArray = new String[n];
		
		//Nhap chuoi
		for(int i=0;i<n;i++) {
			System.out.println("Nhap chuoi "+i+" :");
			stringArray[i] = sc.next();
		}
		
		//Nhap chuoi can tim
		System.out.println("Nhập một chuỗi: ");
		String sValue = sc.next();
		
		//Kiem tra mang co chua chuoi sValue hay khong
		if(Arrays.asList(stringArray).contains(sValue)) {
			System.out.println("Contained!");
		}else {
			System.out.println("No Contained!");
		}
		
	}
}
