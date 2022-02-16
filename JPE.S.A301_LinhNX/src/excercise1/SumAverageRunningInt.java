package excercise1;

import java.util.Scanner;

public class SumAverageRunningInt {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		//Nhap gia tri bien
		System.out.println("Nhập a: ");
		a = sc.nextInt();
		System.out.println("Nhập b: ");
		b = sc.nextInt();
		
		//gan gia tri cho bien
		int d=0 ;
		float s=0;
		//tinh tong tu a -> b va dem so phan tu d 
		for(int i=a; i<=b;) {
			s+=i;
			d++;
			i++;
		}
		
		System.out.println("Trung bình cộng "+a+" đến "+b+" là: "+s/d);
		

	}

}
