package org.knit.solutions.Task5;

public class Chef extends Thread {
    private Tray tray;

    public Chef(Tray tray) {
        this.tray = tray;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                tray.putDish("Dish " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}