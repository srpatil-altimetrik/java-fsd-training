package com.altimetrik;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class User1 {
	private int userId;
	private String userName;

	public void displayUser() {
		System.out.println("------ User Details ------");
		System.out.println("User ID   : " + userId);
		System.out.println("User Name : " + userName);
		System.out.println("--------------------------");
	}
}