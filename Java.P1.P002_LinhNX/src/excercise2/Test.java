package excercise2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Person bill = new Person();
		Wallet wal = new Wallet();
		int n,wallet;
		System.out.print("\nInput number of bill: ");
		n = sc.nextInt();
		
		int[] bills = new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("\nInput value of bill "+(i+1)+": ");
			bills[i] = sc.nextInt();
		}
		
		System.out.print("\nInput value of wallet: ");
		wallet = sc.nextInt();
		wal.setWallet(wallet);
		
		if(wal.payMoney(bill.calcTotal(bills))) {
			System.out.println("This is total of bill: "+bill.calcTotal(bills));
			System.out.println("You can buy it.");
		}else {
			System.out.println("This total of bill: "+bill.calcTotal(bills));
			System.out.println("You can't buy it.");
		}
	}
}
