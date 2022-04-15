package com.company;

public class Calculator {
    private Floor floor = new Floor(1,1);
    private Carpet carpet = new Carpet(0.00);

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return floor.getArea()* carpet.getCost();
    }


}
