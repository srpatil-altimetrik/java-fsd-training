package com.altimetrik.exceptions;

public class BookAlreadyIssuedException extends Exception {
	public BookAlreadyIssuedException(String message) {
		super(message);
	}
}