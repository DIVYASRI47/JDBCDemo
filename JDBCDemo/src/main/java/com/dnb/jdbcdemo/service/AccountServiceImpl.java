package com.dnb.jdbcdemo.service;

import java.util.List;
import java.util.Optional;

import com.dnb.jdbcdemo.dto.Account;
import com.dnb.jdbcdemo.repo.AccountRepositoryImpl;

public class AccountServiceImpl implements AccountService {

	private static AccountService accountservice;
    private AccountServiceImpl(){

    }
    @Override
    public Account createAccount(Account account) {
        // return account;

 

        // TODO Auto-generated method stub
        return AccountRepositoryImpl.getInstance().createAccount(account);
    }
    @Override
    public Optional<Account> getAccountById(String accountId) {
        // TODO Auto-generated method stub
        return AccountRepositoryImpl.getInstance().getAccountById(accountId);
    }

 

    

 

    public static AccountService getInstance() {

        synchronized (AccountServiceImpl.class) {
            if (accountservice == null) {
				accountservice = new AccountServiceImpl();
            }

 

        
        }
        return accountservice;

 

    }
	@Override
	public Optional<Account> getAccountById(Account account) {
		// TODO Auto-generated method stub
		return AccountServiceImpl.getInstance().getAccountById();
	}
	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return AccountRepositoryImpl.getInstance().getAllAccounts();
	}
	@Override
	public Optional<Account> getAccountById() {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

 
}
