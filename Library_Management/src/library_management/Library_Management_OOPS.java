package library_management;

import java.util.Scanner;

import java.util.Scanner;

abstract class Book2 {
	protected int bookId;
	protected String bookName;
	protected double bookPrice;
	protected boolean bookStatus = false; // false: available, true: issued
	protected String issuedToUser = null;

	public Book2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Book ID: ");
		bookId = sc.nextInt();
		sc.nextLine(); // consume newline
		System.out.print("Enter Book Name: ");
		bookName = sc.nextLine();
		System.out.print("Enter Book Price: ");
		bookPrice = sc.nextDouble();
	}

	public void displayDetails() {
		System.out.println("------ Book Details ------");
		System.out.println("ID         : " + bookId);
		System.out.println("Name       : " + bookName);
		System.out.println("Price      : " + bookPrice);
		System.out.println("Status     : " + (bookStatus ? "Issued" : "Available"));
		if (bookStatus) {
			System.out.println("Issued To  : " + issuedToUser);
		}
		System.out.println("--------------------------");
	}

	public void issueBook(String userName) {
		if (!bookStatus) {
			bookStatus = true;
			issuedToUser = userName;
			System.out.println("Book issued to " + userName);
		} else {
			System.out.println("Book is already issued to " + issuedToUser);
		}
	}

	public void returnBook() {
		if (bookStatus) {
			System.out.println("Book returned by " + issuedToUser);
			bookStatus = false;
			issuedToUser = null;
		} else {
			System.out.println("Book is already available.");
		}
	}
}

class LibraryBook2 extends Book2 {
	public LibraryBook2() {
		super();
	}
}

class User2 {
	private int userId;
	private String userName;

	public User2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter User ID: ");
		userId = sc.nextInt();
		sc.nextLine(); // consume newline
		System.out.print("Enter User Name: ");
		userName = sc.nextLine();
	}

	public String getUserName() {
		return userName;
	}

	public void displayUser() {
		System.out.println("------ User Details ------");
		System.out.println("User ID   : " + userId);
		System.out.println("User Name : " + userName);
		System.out.println("--------------------------");
	}
}

public class Library_Management_OOPS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mainChoice;

		LibraryBook book = null;
		User user = null;

		do {
			System.out.println("\nLibrary Management Menu:");
			System.out.println("1. Create Book");
			System.out.println("2. Create User");
			System.out.println("3. Issue Book");
			System.out.println("4. Return Book");
			System.out.println("5. Show Book & User Details");
			System.out.println("6. Exit");
			System.out.print("Enter choice: ");
			mainChoice = sc.nextInt();

			switch (mainChoice) {
			case 1:
				book = new LibraryBook();
				break;

			case 2:
				user = new User();
				break;

			case 3:
				if (book == null) {
					System.out.println("No book created yet.");
				} else if (user == null) {
					System.out.println("No user created yet.");
				} else {
					book.issueBook(user.getUserName());
				}
				break;

			case 4:
				if (book == null) {
					System.out.println("No book created yet.");
				} else {
					book.returnBook();
				}
				break;

			case 5:
				if (book != null)
					book.displayDetails();
				else
					System.out.println("No book created yet.");

				if (user != null)
					user.displayUser();
				else
					System.out.println("No user created yet.");
				break;

			case 6:
				System.out.println("Exiting Library System. Goodbye!");
				break;

			default:
				System.out.println("Invalid choice. Try again.");
			}
		} while (mainChoice != 6);
	}
}
