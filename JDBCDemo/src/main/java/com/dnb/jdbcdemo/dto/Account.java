package com.dnb.jdbcdemo.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Account {

	private String AccountHolderName;
	private String AccountId;
	private float Balance;
	private String AccountType;
	private String ContactNumber;
	private String Address;
	private LocalDate AccountCreatedDate=LocalDate.now();
	private LocalDate Dob;
	public boolean AccountStatus;
	
	
}
