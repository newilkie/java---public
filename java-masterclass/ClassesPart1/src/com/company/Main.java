package com.company;

public class Main {

    public static void main(String[] args) {
        // a class is a template for an object.

	        // Objects have states and behavior.

                // states are characteristics of the object that are stored in fields.
                // behaviors are actions that the object does and are stored in methods.
        Car porche = new Car();
        Car holden = new Car();
        System.out.println("Model is " + porche.getModel());
        porche.setModel("911");
        System.out.println("Model is " + porche.getModel());




    }
}
