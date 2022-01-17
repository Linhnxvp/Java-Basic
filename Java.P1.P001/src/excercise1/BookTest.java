package excercise1;

import java.util.Scanner;

public class BookTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		Book[] book = new Book[30];
		
		int n;
		System.out.println("How many books do you want to create?");
		n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the book"+(i+1)+": \n");
			book[i] = new Book();
			//book[i].getBook_name();
			//book[i].getIsbn();
			//book[i].getAuthor();
			//book[i].getPublisher();
			book[i].nhap();
		}
		
		for(int i=0;i<n;i++) {
			System.out.println("Book "+(i+1));
			book[i].getBookInfo();
			System.out.println();
		}
	}
}
