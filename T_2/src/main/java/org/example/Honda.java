package org.example;

public class Honda extends Car{
    private final int car_mileage;

    public Honda(String color, int maxSpeed, int currentSpeed, String box, int price, int car_mileage) {
        super(color, box, maxSpeed, currentSpeed, price);
        this.car_mileage = car_mileage;
    }
    @Override
    public  String getName(){
        return "Honda";
    }
    public int getCar_mileage(){
        return this.car_mileage;
    }
}