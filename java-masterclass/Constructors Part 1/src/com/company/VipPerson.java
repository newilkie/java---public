package com.company;

public class VipPerson {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipPerson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipPerson(){
        this("Default Name", 100.00,"Default email address.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public VipPerson(String name, double creditLimit){
        this(name,creditLimit,"Default Email Address.");
    }
}
