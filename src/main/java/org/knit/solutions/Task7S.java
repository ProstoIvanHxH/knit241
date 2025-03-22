package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.Task7.Produceer;
import org.knit.solutions.Task7.Reduceer;
import org.knit.solutions.Task7.Shop;

@TaskDescription(taskNumber = 7, taskDescription = "Задача «Производитель-Потребитель с ограничением»")
public class Task7S implements Solution{

    public void execute() {
        System.out.println("Задача 7 запущена");
        Shop shop=new Shop();

        Produceer produceer=new Produceer(shop);
        Reduceer reduceer= new Reduceer(shop);
        produceer.start();
        reduceer.start();
    }
}
