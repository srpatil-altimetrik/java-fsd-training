package library_management;

import java.util.ArrayList;
import java.util.Scanner;

// Custom Exceptions
class BookAlreadyIssuedException extends Exception {
	public BookAlreadyIssuedException(String message) {
		super(message);
	}
}

class BookNotFoundException extends Exception {
	public BookNotFoundException(String message) {
		super(message);
	}
}

class UserNotFoundException extends Exception {
	public UserNotFoundException(String message) {
		super(message);
	}
}

class BookNotIssuedException extends Exception {
	public BookNotIssuedException(String message) {
		super(message);
	}
}

abstract class Book4 {
	protected int bookId;
	protected String bookName;
	protected double bookPrice;
	protected boolean bookStatus = false;
	protected String issuedToUser = null;

	public Book4(int bookId, String bookName, double bookPrice) {
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

	public void issueBook(String userName) throws BookAlreadyIssuedException {
		if (!bookStatus) {
			bookStatus = true;
			issuedToUser = userName;
			System.out.println("✅ Book issued to " + userName);
		} else {
			throw new BookAlreadyIssuedException("Book is already issued to " + issuedToUser);
		}
	}

	public void returnBook() throws BookNotIssuedException {
		if (bookStatus) {
			System.out.println("✅ Book returned by " + issuedToUser);
			bookStatus = false;
			issuedToUser = null;
		} else {
			throw new BookNotIssuedException("Book is already available.");
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

class LibraryBook4 extends Book4 {
	public LibraryBook4(int bookId, String bookName, double bookPrice) {
		super(bookId, bookName, bookPrice);
	}
}

class User4 {
	private int userId;
	private String userName;

	public User4(int userId, String userName) {
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

public class Library_Management_Exception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<LibraryBook4> books = new ArrayList<>();
		ArrayList<User4> users = new ArrayList<>();

		int choice;
		do {
			System.out.println("\n\uD83D\uDCDA Library Management Menu:");
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
				books.add(new LibraryBook4(bId, bName, bPrice));
				System.out.println("Book added successfully!");
				break;

			case 2:
				System.out.print("Enter User ID: ");
				int uId = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter User Name: ");
				String uName = sc.nextLine();
				users.add(new User4(uId, uName));
				System.out.println("User added successfully!");
				break;

			case 3:
				System.out.print("Enter Book ID to issue: ");
				int issueBookId = sc.nextInt();
				System.out.print("Enter User ID to issue to: ");
				int issueUserId = sc.nextInt();

				LibraryBook4 bookToIssue = null;
				for (int i = 0; i < books.size(); i++) {
					if (books.get(i).getBookId() == issueBookId) {
						bookToIssue = books.get(i);
						break;
					}
				}

				User4 userToIssue = null;
				for (int i = 0; i < users.size(); i++) {
					if (users.get(i).getUserId() == issueUserId) {
						userToIssue = users.get(i);
						break;
					}
				}

				try {
					if (bookToIssue == null)
						throw new BookNotFoundException("Book not found.");
					if (userToIssue == null)
						throw new UserNotFoundException("User not found.");
					bookToIssue.issueBook(userToIssue.getUserName());
				} catch (BookNotFoundException | UserNotFoundException | BookAlreadyIssuedException e) {
					System.out.println("Error: " + e.getMessage());
				}
				break;

			case 4:
				System.out.print("Enter Book ID to return: ");
				int returnBookId = sc.nextInt();
				LibraryBook4 bookToReturn = null;
				for (int i = 0; i < books.size(); i++) {
					if (books.get(i).getBookId() == returnBookId) {
						bookToReturn = books.get(i);
						break;
					}
				}
				try {
					if (bookToReturn == null)
						throw new BookNotFoundException("Book not found.");
					bookToReturn.returnBook();
				} catch (BookNotFoundException | BookNotIssuedException e) {
					System.out.println("Error: " + e.getMessage());
				}
				break;

			case 5:
				if (books.isEmpty()) {
					System.out.println("No books added.");
				} else {
					for (int i = 0; i < books.size(); i++) {
						books.get(i).displayDetails();
					}
				}
				break;

			case 6:
				if (users.isEmpty()) {
					System.out.println("No users added.");
				} else {
					for (int i = 0; i < users.size(); i++) {
						users.get(i).displayUser();
					}
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
