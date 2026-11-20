package com.pluralsight;

import com.pluralsight.collection.FixedList;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        FixedList<Integer> numbers = new FixedList<>(4);
        numbers.add(17);
        numbers.add(7);
        numbers.add(1);
        numbers.add(127);
        numbers.add(1270);

        System.out.println(numbers.getItems().size());
        System.out.println(numbers.getItems());
        System.out.println();

        FixedList<String> cars = new FixedList<>(2);
        cars.add("Camaro");
        cars.add("Silverado");
        cars.add("Flyer");

        System.out.println(cars.getItems().size());
        System.out.println(cars.getItems());
        System.out.println();
    }
}
