package com.dnb.jdbcdemo;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.Optional;
import java.util.Scanner;

import com.dnb.jdbcdemo.dto.Account;
import com.dnb.jdbcdemo.service.AccountServiceImpl;

public class JDBCApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account = new Account();
		account.setAccountId("922");
		account.setAccountHolderName("Divyasri");
		account.setAccountType("Savings");
		account.setBalance(441.7f);
		account.setContactNumber("8345");

		account.setAddress("Santhoshima temple Malkajgiri");
		account.setAccountCreatedDate(LocalDate.now());
		account.setDob(LocalDate.of(2001, 9, 10));
		account.setAccountStatus(true);
		//System.out.println(AccountServiceImpl.getInstance().createAccount(account));

		Scanner sc=new Scanner(System.in);
		int sample=sc.nextInt();
		while(true) {
			
		switch (sample) {
		
		
		case 1:
			
			System.out.println(AccountServiceImpl.getInstance().createAccount(account));
			
			
			break;

		case 2:
			String accid=sc.next();
			System.out.println(AccountServiceImpl.getInstance().getAccountById(accid));
			
			break;
		case 3:
			System.out.println(AccountServiceImpl.getInstance().getAllAccounts());

		case 4:
			System.out.println("Exiting  ");
			System.exit(0);
		}
		
		}
}

}
