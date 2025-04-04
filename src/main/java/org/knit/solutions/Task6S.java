package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.Task6.Car;
import org.knit.solutions.Task6.Crossing;
import org.knit.solutions.Task6.Train;

@TaskDescription(taskNumber = 6, taskDescription = "Задача «Железнодорожный переезд»")
public class Task6S implements Solution{

    public void execute() {
        System.out.println("Задача 6 запущена");
        Crossing crossing = new Crossing();

        new Thread(new Train(crossing)).start();


        for (int i = 1; i <= 3; i++) {
            new Thread(new Car("car " + i, crossing)).start();
        }
    }
}
