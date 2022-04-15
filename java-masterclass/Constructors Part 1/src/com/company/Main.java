package com.company;

public class Main {

    public static void main(String[] args) {
	// create a new class for a bank account
        // Create Fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and cetters for each field
        // Create two additional methods
        // 1.  To allow the customer to deposit funds ( this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawl to complete if their are inssufficent funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.

        Account bobsAccount = new Account();//"12345", 0.00, "Bob Brown", "myemail@bob.com", "(087) 123-4567");

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawl(100.0);
        bobsAccount.deposit(50.0);
        bobsAccount.withdrawl(100.0);
        bobsAccount.deposit(51.0);
        bobsAccount.withdrawl(100.0);

        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        ;
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());

        //Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors.
        // 1st constructor empty should call the constructor with 3 parameters with default values.
        // 2nd constructor should pass on 2 value sit receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters won't be needed
        // test and confirm it works.

        VipPerson awesome = new VipPerson();
        System.out.println(awesome.getName());
        System.out.println(awesome.getCreditLimit());
        System.out.println(awesome.getEmailAddress());

        VipPerson nextInLine = new VipPerson("The Best Guy", 1000000.00, "TheBesstGuy@theBestGuy.com");
        System.out.println(nextInLine.getName());
        System.out.println(nextInLine.getCreditLimit());
        System.out.println(nextInLine.getEmailAddress());


    }
}
