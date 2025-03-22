package org.knit.solutions.Task6;

public class Car implements Runnable {
    private String name;
    private Crossing crossing;

    public Car(String name, Crossing crossing) {
        this.name = name;
        this.crossing = crossing;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println(name + " waits");
                crossing.waitUntilTrainPasses();
                System.out.println(name + ": passed rail");
                Thread.sleep(1000);
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}