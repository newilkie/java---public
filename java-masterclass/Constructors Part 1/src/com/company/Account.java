package com.company;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account(){
        this("56789", 2.50, "Default Name", "Default address", "default phone");
        System.out.println("Empty constructor called default values added.");
    }

    public Account(String number, double balance, String customerName,String customerEmailAddress, String customerPhoneNumber){
        System.out.println("Constructor with parameters called.");

        setNumber(number);

        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;

    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("9999", 100.55, customerName, customerEmailAddress,customerPhoneNumber);
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawl(double withdrawlAmount){
        if(this.balance - withdrawlAmount < 0.0d){
            System.out.println("Only " + this.balance + " available. Withdrawl not processed.");
        }else{
            this.balance -= withdrawlAmount;
            System.out.println("Withdrawl of " + withdrawlAmount + " processed. Remaining balance = " + this.balance);
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

    public void setBalance(double accountBalance) {
        this.balance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
