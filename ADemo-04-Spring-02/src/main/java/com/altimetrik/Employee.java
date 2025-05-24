package com.altimetrik;

import java.util.ArrayList;
import java.util.HashSet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Employee {
	private int uid;
	private String name;
	private String city;
	private int phoneNo;
	private String hobies[];
	private ArrayList courses;
	private HashSet emails;

	void display() {
		System.out.println("Employee : " + uid);
		System.out.println("Employee Name : " + name);
		System.out.println("Employee City : " + city);
		System.out.println("Employee phoneNo : " + phoneNo);
		System.out.print("Employee Hobies :");
		for (String hb : hobies) {
			System.out.print(hb + ", ");
		}
		System.out.println();
		System.out.println("Employee Courses : " + courses);
		System.out.println("Employee emails : " + emails);
	}
}
