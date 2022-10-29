package org.example;

public class BMW extends Car{
    private final int numb_of_seats;
    public BMW(String color, int maxSpeed, int currentSpeed, String box, int price, int numb_of_seats) {
        super(color, box, maxSpeed, currentSpeed, price);
        this.numb_of_seats = numb_of_seats;
    }
    @Override
    public  String getName(){
        return "BMW";
    }
    public int getNumb_of_seats(){
        return this.numb_of_seats;
    }
}