package com.tit.week04.day02.collections.bankingsystem;

import java.util.*;

class BankSystem {
    private Map<Integer, Double> accounts = new HashMap<>();
    private TreeMap<Double, Integer> sortedAccounts = new TreeMap<>();
    private Queue<Integer> withdrawalQueue = new LinkedList<>();

    // Add a new account
    public void addAccount(int accountNumber, double initialBalance) {
        accounts.put(accountNumber, initialBalance);
        sortedAccounts.put(initialBalance, accountNumber);
    }

    // Deposit money into an account
    public void deposit(int accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            double newBalance = accounts.get(accountNumber) + amount;
            sortedAccounts.remove(accounts.get(accountNumber));  // Remove old balance
            accounts.put(accountNumber, newBalance);
            sortedAccounts.put(newBalance, accountNumber);  // Add updated balance
            System.out.println("Deposited " + amount + " to Account " + accountNumber);
        } else {
            System.out.println("Account not found!");
        }
    }

    // Request a withdrawal
    public void requestWithdrawal(int accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.offer(accountNumber);
            System.out.println("Withdrawal request added for Account " + accountNumber);
        } else {
            System.out.println("Account not found!");
        }
    }

    // Process withdrawal requests
    public void processWithdrawals(double amount) {
        while (!withdrawalQueue.isEmpty()) {
            int accountNumber = withdrawalQueue.poll();
            if (accounts.get(accountNumber) >= amount) {
                sortedAccounts.remove(accounts.get(accountNumber));  // Remove old balance
                accounts.put(accountNumber, accounts.get(accountNumber) - amount);
                sortedAccounts.put(accounts.get(accountNumber), accountNumber);  // Add updated balance
                System.out.println("Withdrew " + amount + " from Account " + accountNumber);
            } else {
                System.out.println("Insufficient balance for Account " + accountNumber);
            }
        }
    }

    // Display all accounts
    public void displayAccounts() {
        System.out.println("\nAll Accounts:");
        for (Map.Entry<Integer, Double> entry : accounts.entrySet()) {
            System.out.println("Account " + entry.getKey() + ": " + entry.getValue());
        }
    }

    // Display accounts sorted by balance
    public void displaySortedAccounts() {
        System.out.println("\nAccounts Sorted by Balance:");
        for (Map.Entry<Double, Integer> entry : sortedAccounts.entrySet()) {
            System.out.println("Account " + entry.getValue() + ": " + entry.getKey());
        }
    }

}



