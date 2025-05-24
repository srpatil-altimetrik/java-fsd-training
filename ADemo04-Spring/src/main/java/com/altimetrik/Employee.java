package com.altimetrik;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {
	private int uid;
	private String name;
	private String city;
	private int phoneNo;

	void display() {
		System.out.println("Employee : " + uid);
		System.out.println("Employee Name : " + name);
		System.out.println("Employee City : " + city);
		System.out.println("Employee phoneNo : " + phoneNo);
	}
}
