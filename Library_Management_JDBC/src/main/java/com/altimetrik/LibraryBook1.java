package com.altimetrik;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class LibraryBook1 {
	private int bookId;
	private String bookName;
	private double bookPrice;
	private boolean bookStatus;
	private String issuedToUser;

	public void displayDetails() {
		System.out.println("------ Book Details ------");
		System.out.println("ID         : " + bookId);
		System.out.println("Name       : " + bookName);
		System.out.println("Price      : " + bookPrice);
		System.out.println("Status     : " + (bookStatus ? "Issued to " + issuedToUser : "Available"));
		System.out.println("--------------------------");
	}
}
