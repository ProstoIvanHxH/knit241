package org.knit.solutions;

import org.knit.TaskDescription;

@TaskDescription(taskNumber = 18, taskDescription = "Дан массив целых чисел arr фиксированной длины. Необходимо продублировать каждое вхождение нуля, сдвигая остальные элементы вправо.\n" +
        "\n")
public class Task18S implements Solution {

    public void execute() {
        System.out.println("Задача 18 запущена");
        int[] arr = new int[]{1,0,6,4,6,0,0,5};
        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println("aboba");
        duplicateZeros(arr);
        for (int i : arr) {
            System.out.print(i);
        }
    }


    public static void duplicateZeros(int[] arr) {
        int l = arr.length - 1;
        for (int i = 0; i < l; i++) {
            if (arr[i] == 0 && i < l) {
                for (int j = l; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i++;
            }
        }
    }


}
