package org.knit.solutions.Task8;

public class Main {
    public static void main(String[] args) {
        Road road=new Road();
        new Thread(new Light(road)).start();
        for (int i = 1; i <= 3; i++) {
            new Thread(new Car("car " + i, road)).start();
        }
    }
}
