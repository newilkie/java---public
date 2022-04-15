package com.company;

public class Account {
    private String number = "";
    private double balance = 0.00d;
    private String customerName = "";
    private String customerEmailAddress = "";
    private String customerPhoneNumber = "";

    public Account(){
        this("56789", 2.50, "Default name", "Default address", "default phone");

        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber){
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawl(double withdrawlAmount){
        if(this.balance - withdrawlAmount < 0){
            System.out.println("Only " + balance + " available. Withdrawl not processed");
        }else{
            this.balance -= withdrawlAmount;
            System.out.println("Withdrawl of " + withdrawlAmount + " processed. Remaining balance: " + this.balance);
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

    public String getEmail() {
        return customerEmailAddress;
    }

    public void setEmailAddress(String email) {
        this.customerEmailAddress = email;
    }

    public String getPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.customerPhoneNumber = phoneNumber;
    }
}
