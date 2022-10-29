package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String args[]) {
        Map<Car, Integer> map = new HashMap<>();

        Moskvich moskvich_512 = new Moskvich("yellow", 150, 0, "Механика", 100_000, 48);
        Honda honda_с = new Honda("grey", 200, 0, "Синтетика", 800_000, 20000);
        Honda honda_v = new Honda("green", 200, 0, "Синтетика", 700_000, 40000);
        BMW x5 = new BMW("black", 280, 150, "Автомат", 2_000_0000,5);
        map.put(x5,1);
        map.put(x5,1);
        map.put(moskvich_512,1);
        map.put(honda_с,1);
        map.compute(x5, ((Car, Integer) -> Integer == null ? 1 : Integer + 1));

        Garage garage = new Garage(map,5);
        garage.auto_info_sort_by_value();
        garage.auto_info_sort_by_price();
        System.out.println(x5.getName());
        x5.start(200);
        System.out.println(garage.size);
        System.out.println(honda_с.getName());
        honda_с.accelerate(100);
    }
}