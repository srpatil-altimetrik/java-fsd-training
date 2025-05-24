package com.altimetrik;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.altimetrik.exceptions.BookAlreadyIssuedException;
import com.altimetrik.exceptions.BookNotFoundException;
import com.altimetrik.exceptions.BookNotIssuedException;
import com.altimetrik.exceptions.UserNotFoundException;
import com.altimetrik.User1;
import com.altimetrik.LibraryBook1;
import com.altimetrik.DBConnection1;

public class Library_Management_JDBC {
	public static void main(String[] args) throws BookNotIssuedException {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("\nLibrary Management Menu:");
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
				try (Connection con = DBConnection1.getConnection1();
						PreparedStatement pst = con
								.prepareStatement("INSERT INTO books VALUES (?, ?, ?, false, null)");) {
					pst.setInt(1, bId);
					pst.setString(2, bName);
					pst.setDouble(3, bPrice);
					pst.executeUpdate();
					System.out.println("Book added successfully!");
				} catch (SQLException e) {
					System.out.println("Database error: " + e.getMessage());
				}
				break;

			case 2:
				System.out.print("Enter User ID: ");
				int uId = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter User Name: ");
				String uName = sc.nextLine();
				try (Connection con = DBConnection1.getConnection1();
						PreparedStatement pst = con.prepareStatement("INSERT INTO users VALUES (?, ?)");) {
					pst.setInt(1, uId);
					pst.setString(2, uName);
					pst.executeUpdate();
					System.out.println("User added successfully!");
				} catch (SQLException e) {
					System.out.println("Database error: " + e.getMessage());
				}
				break;

			case 3:
				System.out.print("Enter Book ID to issue: ");
				int issueBookId = sc.nextInt();
				System.out.print("Enter User ID to issue to: ");
				int issueUserId = sc.nextInt();
				try (Connection con = DBConnection1.getConnection1()) {
					PreparedStatement bookCheck = con
							.prepareStatement("SELECT book_status FROM books WHERE book_id = ?");
					bookCheck.setInt(1, issueBookId);
					ResultSet rs = bookCheck.executeQuery();
					if (!rs.next())
						throw new BookNotFoundException("Book not found.");
					if (rs.getBoolean("book_status"))
						throw new BookAlreadyIssuedException("Book is already issued.");

					PreparedStatement userCheck = con.prepareStatement("SELECT user_name FROM users WHERE user_id = ?");
					userCheck.setInt(1, issueUserId);
					ResultSet rs2 = userCheck.executeQuery();
					if (!rs2.next())
						throw new UserNotFoundException("User not found.");
					String userName = rs2.getString("user_name");

					PreparedStatement update = con.prepareStatement(
							"UPDATE books SET book_status = true, issued_to_user = ? WHERE book_id = ?");
					update.setString(1, userName);
					update.setInt(2, issueBookId);
					update.executeUpdate();
					System.out.println("Book issued to " + userName);
				} catch (SQLException | com.altimetrik.exceptions.BookNotFoundException
						| com.altimetrik.exceptions.BookAlreadyIssuedException
						| com.altimetrik.exceptions.UserNotFoundException e) {
					System.out.println("Error: " + e.getMessage());
				}
				break;

			case 4:
				System.out.print("Enter Book ID to return: ");
				int returnBookId = sc.nextInt();
				try (Connection con = DBConnection1.getConnection1()) {
					PreparedStatement check = con.prepareStatement("SELECT book_status FROM books WHERE book_id = ?");
					check.setInt(1, returnBookId);
					ResultSet rs = check.executeQuery();
					if (!rs.next())
						throw new BookNotFoundException("Book not found.");
					if (!rs.getBoolean("book_status"))
						throw new BookNotIssuedException("Book is already available.");

					PreparedStatement update = con.prepareStatement(
							"UPDATE books SET book_status = false, issued_to_user = NULL WHERE book_id = ?");
					update.setInt(1, returnBookId);
					update.executeUpdate();
					System.out.println("Book returned successfully.");
				} catch (SQLException | com.altimetrik.exceptions.BookNotFoundException e) {
					System.out.println("Error: " + e.getMessage());
				}
				break;

			case 5:
				try (Connection con = DBConnection1.getConnection1();
						Statement st = con.createStatement();
						ResultSet rs = st.executeQuery("SELECT * FROM books");) {
					while (rs.next()) {
						LibraryBook1 book = new LibraryBook1(rs.getInt("book_id"), rs.getString("book_name"),
								rs.getDouble("book_price"), rs.getBoolean("book_status"),
								rs.getString("issued_to_user"));
						book.displayDetails();
					}
				} catch (SQLException e) {
					System.out.println("Error: " + e.getMessage());
				}
				break;

			case 6:
				try (Connection con = DBConnection1.getConnection1();
						Statement st = con.createStatement();
						ResultSet rs = st.executeQuery("SELECT * FROM users");) {
					while (rs.next()) {
						User1 user = new User1(rs.getInt("user_id"), rs.getString("user_name"));
						user.displayUser();
					}
				} catch (SQLException e) {
					System.out.println("Error: " + e.getMessage());
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
