package org.knit.solutions.Task6;

public class Train implements Runnable {
    private Crossing crossing;

    public Train(Crossing crossing) {
        this.crossing = crossing;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("train arriving");
                crossing.trainArriving();
                Thread.sleep(5000);
                System.out.println("train gone");
                crossing.trainLeaving();
                Thread.sleep(20000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

