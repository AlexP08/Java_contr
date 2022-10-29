package org.example;

public class Moskvich extends Car{
    private final int year;

    public Moskvich(String color, int maxSpeed, int currentSpeed, String box, int price, int year) {
        super(color, box, maxSpeed, currentSpeed, price);
        this.year = year;
    }
    @Override
    public  String getName(){
        return "Moskvich";
    }
    public int getYear(){
        return this.year;
    }
}
