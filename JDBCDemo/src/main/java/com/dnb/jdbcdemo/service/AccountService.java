package com.dnb.jdbcdemo.service;

import java.util.List;
import java.util.Optional;

import com.dnb.jdbcdemo.dto.Account;

public interface AccountService {

	public Account createAccount(Account account);
    public Optional<Account> getAccountById(String accountId);
	//public char[] AccountById(Account account);
	public  Optional<Account>getAccountById(Account account);
	
	 public List<Account> getAllAccounts();
	public Optional<Account> getAccountById();
}
