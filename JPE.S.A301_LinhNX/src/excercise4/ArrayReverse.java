package excercise4;

import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Enter the number of elements in the array: ");
		n = sc.nextInt();
		
		int[] myIntArray = new int[n];
		
		//Enter array
		for(int i=0; i<n; i++) {
			System.out.println("A["+i+"]=");
			myIntArray[i] = sc.nextInt();
		}
		
		System.out.print("Array before reverse: ");
		for(int i=0; i<n; i++) {
			System.out.print(myIntArray[i]+ " ");	
		}
		System.out.println();
		
		//Reverse array
		for(int i =0; i<n/2;i++) {
				int temp = myIntArray[i];
				myIntArray[i]=myIntArray[n-i-1];
				myIntArray[n-i-1]=temp;
		}
		
		System.out.print("Array after reverse: ");
		for(int i=0; i<n; i++) {
			System.out.print(myIntArray[i]+ " ");
		}
	}
}
