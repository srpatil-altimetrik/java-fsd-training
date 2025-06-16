package com.altimetrik.model.embeded;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

	private String streetName;
	
	private String houseNum;
	
	private String zipCode;
}
