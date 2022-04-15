package com.company;

public class Point {
    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt(getX()*getX() + getY()*getY());
    }

    public double distance(int x, int y){
        return Math.sqrt((x-getX())*(x-getX()) + (y-getY())*(y-getY()));
    }

    public double distance(Point point){
        return Math.sqrt((point.getX()-this.getX())*(point.getX()-this.getX()) + (point.getY() - this.getY())* (point.getY() - this.getY()));
    }
}
