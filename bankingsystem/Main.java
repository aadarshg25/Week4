package com.tit.week04.day02.collections.bankingsystem;

public class Main {
    public static void main(String[] args) {
        BankSystem bank = new BankSystem();

        bank.addAccount(101, 5000);
        bank.addAccount(102, 3000);
        bank.addAccount(103, 7000);

        bank.displayAccounts();
        bank.displaySortedAccounts();

        bank.deposit(101, 2000);
        bank.displayAccounts();

        bank.requestWithdrawal(102);
        bank.processWithdrawals(1000);
        bank.displayAccounts();
    }
}
