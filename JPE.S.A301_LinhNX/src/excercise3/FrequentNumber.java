package excercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FrequentNumber {

	final public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int len, count=0, value;
		String ans;
		
		//tao mang chua vi tri xuat hien
		List index = new ArrayList<>();
		
		//Nhap so pt mang
		System.out.println("Nhap so phan tu cua mang: ");
		len = sc.nextInt();
		
		//Khoi tao mang
		int[] intArray = new int[len];
		
		//Nhap mang
		for(int i=0; i<len;i++) {
			
			if(i>5) {
				System.out.println("Bạn có muốn tiếp tục(co=Y/y)?");
				ans = sc.next();
				if(ans.equalsIgnoreCase("Y")){
					
				}else {
					break;
				}
			}
			System.out.println("Nhap phan tu "+i+" : ");
			intArray[i] = sc.nextInt();
			
		}
		
		//Nhap so can tim
		System.out.println("Nhap 1 so bat ky: ");
		value = sc.nextInt();
		
		//Dem so lan xuat hien
		for(int i=0;i<len;i++) {
			if(intArray[i]==value) {
				count++;
				//Them vi tri xuat hien
				index.add(i);
			}
			
		}
		
		 System.out.println("Số lần xuất hiện: "+count);
		 System.out.print("Vị trí xuất hiện: "+index);
		 
		 
	}

}
