package com.altimetrik.utilities;

import java.util.Scanner;
import java.util.StringTokenizer;

public class UtilityStringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str, " "); // Create a StringTokenizer to split the string by spaces
		System.out.println("StringTokenizer output:"+ st.countTokens()); // Print the number of tokens in the string
		int totalCount = 0;
		while (st.hasMoreTokens()) { // Check if there are more tokens
			String word = st.nextToken(); // Get the next token
			System.out.println("Word: " + word);
			int vowelCount = 0;
			
			for(char ch : word.toCharArray()) { // Iterate through each character in the word
				ch = Character.toLowerCase(ch); // Convert character to lowercase for case-insensitive comparison
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowelCount++; // Increment the vowel count if the character is a vowel
					totalCount++; // Increment the total vowel count
				}
				
			}
			System.out.println("Number of vowels in '" + word + "': " + vowelCount);
		}
		System.out.println("Total number of vowels in the string: " + totalCount);
		sc.close();
	}
}
