package org.knit.solutions.Task8;

public class Road {
    private boolean isRed = false;

    public synchronized void redLight() {
        isRed = true;
    }

    public synchronized void greenLight() {
        isRed = false;
        notifyAll();
    }

    public synchronized void traffic() throws InterruptedException {
        while (isRed) {
            wait();
        }
    }
}