package library_management;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Book3 {
	protected int bookId;
	protected String bookName;
	protected double bookPrice;
	protected boolean bookStatus = false; // false = available, true = issued
	protected String issuedToUser = null;

	public Book3(int bookId, String bookName, double bookPrice) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	public int getBookId() {
		return bookId;
	}

	public boolean isIssued() {
		return bookStatus;
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

	public void displayDetails() {
		System.out.println("------ Book Details ------");
		System.out.println("ID         : " + bookId);
		System.out.println("Name       : " + bookName);
		System.out.println("Price      : " + bookPrice);
		System.out.println("Status     : " + (bookStatus ? "Issued to " + issuedToUser : "Available"));
		System.out.println("--------------------------");
	}
}

class LibraryBook3 extends Book3 {
	public LibraryBook3(int bookId, String bookName, double bookPrice) {
		super(bookId, bookName, bookPrice);
	}
}

class User3 {
	private int userId;
	private String userName;

	public User3(int userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}

	public int getUserId() {
		return userId;
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

public class Library_Management_Collection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<LibraryBook3> books = new ArrayList<>();
		ArrayList<User3> users = new ArrayList<>();

		int choice;
		do {
			System.out.println("\n📚 Library Management Menu:");
			System.out.println("1. Add Book");
			System.out.println("2. Add User");
			System.out.println("3. Issue Book");
			System.out.println("4. Return Book");
			System.out.println("5. Show All Books");
			System.out.println("6. Show All Users");
			System.out.println("7. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter Book ID: ");
				int bId = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Book Name: ");
				String bName = sc.nextLine();
				System.out.print("Enter Book Price: ");
				double bPrice = sc.nextDouble();
				books.add(new LibraryBook3(bId, bName, bPrice));
				System.out.println("Book added successfully!");
				break;

			case 2:
				System.out.print("Enter User ID: ");
				int uId = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter User Name: ");
				String uName = sc.nextLine();
				users.add(new User3(uId, uName));
				System.out.println("User added successfully!");
				break;

			case 3:
				System.out.print("Enter Book ID to issue: ");
				int issueBookId = sc.nextInt();
				System.out.print("Enter User ID to issue to: ");
				int issueUserId = sc.nextInt();

				LibraryBook3 bookToIssue = null;
				for (LibraryBook3 b : books) {
					if (b.getBookId() == issueBookId) {
						bookToIssue = b;
						break;
					}
				}

				User3 userToIssue = null;
				for (User3 u : users) {
					if (u.getUserId() == issueUserId) {
						userToIssue = u;
						break;
					}
				}

				if (bookToIssue != null && userToIssue != null) {
					bookToIssue.issueBook(userToIssue.getUserName());
				} else {
					System.out.println("Book/User not found.");
				}
				break;

			case 4:
				System.out.print("Enter Book ID to return: ");
				int returnBookId = sc.nextInt();
				boolean found = false;
				for (LibraryBook3 b : books) {
					if (b.getBookId() == returnBookId) {
						b.returnBook();
						found = true;
						break;
					}
				}
				if (!found) {
					System.out.println("Book not found.");
				}
				break;

			case 5:
				if (books.isEmpty()) {
					System.out.println("No books added.");
				} else {
					for (LibraryBook3 b : books)
						b.displayDetails();
				}
				break;

			case 6:
				if (users.isEmpty()) {
					System.out.println("No users added.");
				} else {
					for (User3 u : users)
						u.displayUser();
				}
				break;

			case 7:
				System.out.println("Exiting the system. Thank you!");
				break;

			default:
				System.out.println("Invalid choice. Try again.");
			}
		} while (choice != 7);
	}
}
