package com.tnsif.day_8.interfaces.implementinginterfaces;

public class BankImpl implements Bank {
 public void deposit(Account account, double amount) {
	 if (amount > DEPOSIT_LIMIT)
			System.err.println("Deposit not possible.. exceeds Deposit Limit");
		else
			account.setBalance(account.getBalance()+amount);
     System.out.println("Deposited " + amount + " into account: " + account.getAccNo());
 }
 public void withdraw(Account account, double amount) {
	 if (account.getBalance() - amount >= MIN_BALANCE)
	 {
			account.setBalance(account.getBalance()-amount);
			System.out.println("Withdrawn " + amount + " from account: " + account.getAccNo());
	 }
	 else
		 System.out.println("Insufficient balance in account: " + account.getAccNo());
 }
}