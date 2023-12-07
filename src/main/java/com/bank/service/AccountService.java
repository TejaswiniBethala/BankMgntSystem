package com.bank.service;

import java.util.List;

import com.bank.entity.Account;

public interface AccountService
{
	public Account getAccountDetails(String id);
	public List<Account> getAccountDetails();
	public String insertAccount(Account a);
	public String update(Account a);
	public String deleteAccount(String id);
	public Account getByAccountNumber(String id);
	
	public String depositAmount(String accountNumber, int amount);
	public String withdrawAmount(String accountNumber,int amount);
}
