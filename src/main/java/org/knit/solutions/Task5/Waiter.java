package org.knit.solutions.Task5;

public class Waiter extends Thread {
    private Tray tray;

    public Waiter(Tray tray) {
        this.tray = tray;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                tray.takeDish();
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}