package com.altimetrik.exception;

public class InvalidAgeException extends Exception {
		public InvalidAgeException(String message) {
		super(message);
	}

	public InvalidAgeException(String message, Throwable cause) {
		super(message, cause);
	}
}
