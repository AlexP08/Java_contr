package org.example;

public class Car {
    /**
      Родительский класс автомобиля
     */
    private final String color, type_box;
    private int maxSpeed, currentSpeed;
    public int price;

    public Car(String color,String type_box, int maxSpeed, int currentSpeed, int price){
        this.color = color;
        this.type_box = type_box;
        this.maxSpeed = maxSpeed;
        this.currentSpeed =currentSpeed;
        this.price = price;
    }

    public void start(int i){
        while (this.currentSpeed < this.maxSpeed){
            this.currentSpeed++;
        }
        System.out.println("Скорость на старте: " + this.currentSpeed+"\n");

    }

    public void stop(){
        if (this.currentSpeed != 0){
            this.currentSpeed = 0;
        } else {
            throw new ArithmeticException();
        }
        System.out.println("Стоп: " + this.currentSpeed+"\n");
    }

    public void accelerate(int speed){
        // Изменение скорости машины
        if (this.currentSpeed+speed < maxSpeed) {
            this.currentSpeed += speed;
            System.out.println("Измененилась на "+speed+":\nСтало = " + this.currentSpeed+"\n");
        }
        else {
            System.out.println("Изменение скорости машины:\n");
            System.out.println("Скорость не может быть больше максимальной!\n"+"Текущая скорость = "+this.currentSpeed);
        }
    }
    public int getPrice(){
        return this.price;
    }
    public String getColor(){
        return this.color;
    }
    public String getType_box(){
        return this.type_box;
    }
    public  String getName(){
        return "Непонятный автомобиль";
    }
}
