package org.knit.solutions;
import org.knit.TaskDescription;
import org.knit.solutions.Task5.Chef;
import org.knit.solutions.Task5.Tray;
import org.knit.solutions.Task5.Waiter;

@TaskDescription(taskNumber = 5, taskDescription = "Задача «Ресторан: Повар и Официант»")
public class Task5S implements Solution {
    @Override
    public void execute() {
        System.out.println("Задача 5 запущена");
        Tray tray = new Tray();

        Chef chef = new Chef(tray);
        Waiter waiter = new Waiter(tray);
        chef.start();
        waiter.start();
    }
}