package com.company;

public class Main {

    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("North");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("East");

        Ceiling ceiling = new Ceiling( 12, 55);

        Floor floor = new Floor("Shag","lime green");

        Bed bed = new Bed("Modern", 4, 3,2,1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Tims", wall1,wall2,wall3,wall4,ceiling,floor,bed,lamp);

        bedroom.makeBed();

        bedroom.getLamp().turnOn();


    }
}
