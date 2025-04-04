package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.Task8.Car;
import org.knit.solutions.Task8.Light;
import org.knit.solutions.Task8.Road;

@TaskDescription(taskNumber = 8, taskDescription = "Задача «Перекресток: светофор и машины»")
public class Task8S implements Solution{

    public void execute() {
        System.out.println("Задача 8 запущена");
        Road road=new Road();
        new Thread(new Light(road)).start();
        for (int i = 1; i <= 3; i++) {
            new Thread(new Car("car " + i, road)).start();
        }
    }
}
