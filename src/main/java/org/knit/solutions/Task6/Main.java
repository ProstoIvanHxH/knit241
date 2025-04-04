package org.knit.solutions.Task6;

public class Main {
    public static void main(String[] args) {
        Crossing crossing = new Crossing();

        new Thread(new Train(crossing)).start();


        for (int i = 1; i <= 3; i++) {
            new Thread(new Car("car " + i, crossing)).start();
        }
    }
}