package com.example.bridgelabz.model;

import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class AddressBookModel { 
	

	@Pattern(regexp = "^[A-Z]{1,}[a-zA-z\\s]{2,}$", message = "FirstName is invalid")
	private String firstName;
	@Pattern(regexp = "^[A-Z]{1,}[a-zA-z\\s]{2,}$", message = "LastName is invalid")
	private String lastName;
	@Pattern(regexp = "^[A-Z]{1,}[a-zA-z\\s]{2,}$", message = "Address is invalid")
	private String address;
	@Pattern(regexp = "^[A-Z]{1,}[a-zA-z\\s]{2,}$", message = "State is invalid")
	private String state;
	@Pattern(regexp = "^[A-Z]{1,}[a-zA-z\\s]{2,}$", message = "Zip is invalid")
	private String city;
	@Pattern(regexp = "^[0-9]{6}$", message = "Invalid Zip")
	private String zip;
	@Pattern(regexp = "^[7-9]{1}[0-9]{9}$", message = "Invalid Phone number")
	private String phone;


}
