package org.knit.solutions.Task7;


import java.util.concurrent.ThreadLocalRandom;

public class Produceer extends Thread {
    private Shop shop;

    public Produceer(Shop shop) {
        this.shop=shop;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                shop.makeItem("item " + i);
                Thread.sleep(ThreadLocalRandom.current().nextInt(200,4000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
