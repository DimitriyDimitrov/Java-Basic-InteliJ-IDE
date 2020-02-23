package com.company;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAdress;
    private String custromerPhoneNumber;

    public Account(String customerName, String customerEmailAdress, String custromerPhoneNumber) {
        this("99999", 100.10, customerName, customerEmailAdress, custromerPhoneNumber);
    }

    public Account() {
        this("5678", 2.50, "Default name", "Default address", "Default phone");

    }

    public Account(String number, double balance, String customerEmailAdress, String customerName, String custromerPhoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAdress = customerEmailAdress;
        this.custromerPhoneNumber = custromerPhoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (balance - withdrawalAmount <= 0) {
            System.out.println("Only " + balance + " available.");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Witdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAdress() {
        return customerEmailAdress;
    }

    public void setCustomerEmailAdress(String customerEmailAdress) {
        this.customerEmailAdress = customerEmailAdress;
    }

    public String getCustromerPhoneNumber() {
        return custromerPhoneNumber;
    }

    public void setCustromerPhoneNumber(String custromerPhoneNumber) {
        this.custromerPhoneNumber = custromerPhoneNumber;
    }
}

