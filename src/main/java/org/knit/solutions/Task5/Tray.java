package org.knit.solutions.Task5;

import java.util.LinkedList;
import java.util.Queue;

public class Tray {
    private static final int maxDish = 3;
    private Queue<String> dishes = new LinkedList<>();

    public synchronized void putDish(String dish) throws InterruptedException {
        while (dishes.size() >= maxDish) {
            wait();
        }
        dishes.add(dish);
        System.out.println(dish+" well cooked");
        notify();
    }

    public synchronized String takeDish() throws InterruptedException {
        while (dishes.isEmpty()) {
            wait();
        }
        String dish = dishes.poll();
        System.out.println(dish+" served");
        notify();
        return dish;
    }
}