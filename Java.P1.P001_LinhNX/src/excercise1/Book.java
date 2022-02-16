package excercise1;

import java.util.Scanner;

public class Book {
	Scanner sc = new Scanner(System.in);
	
	String book_name;
	int isbn;
	String author;
	String publisher;

	
	public Book() {
		super();
	}

	public Book(String book_name, int isbn, String author, String publisher) {
		super();
		this.book_name = book_name;
		this.isbn = isbn;
		this.author = author;
		this.publisher = publisher;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void getBookInfo() {
		System.out.println("Book name: "+book_name);
		System.out.println("ISBN: "+isbn);
		System.out.println("Author: "+author);
		System.out.println("Publisher: "+publisher);
	}
	
	public void nhap() {
		System.out.println("name: ");
		book_name = sc.next();
		System.out.println("isbn: ");
		isbn = sc.nextInt();
		System.out.println("author: ");
		author = sc.next();
		System.out.println("publisher: ");
		publisher = sc.next();
	}
}
