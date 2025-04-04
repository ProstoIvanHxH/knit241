package org.knit.solutions.Task8;



public class Light implements Runnable {
    private Road road;

    public Light(Road road) {
        this.road=road;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("red light");
                road.redLight();
                Thread.sleep(5000);
                System.out.println("green light");
                road.greenLight();
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
