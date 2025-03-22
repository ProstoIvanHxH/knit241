package org.knit.solutions.Task7;

import java.util.LinkedList;
import java.util.Queue;

public class Shop {
    private static final int maxItems = 5;
    private Queue<String> items = new LinkedList<>();

    public synchronized void makeItem(String item) throws InterruptedException {
        while (items.size() >= maxItems) {
            wait();
        }
        items.add(item);
        System.out.println(item+" produced");
        notify();
    }

    public synchronized String buyItem() throws InterruptedException {
        while (items.isEmpty()) {
            wait();
        }
        String item = items.poll();
        System.out.println(item+" sold");
        notify();
        return item;
    }
}