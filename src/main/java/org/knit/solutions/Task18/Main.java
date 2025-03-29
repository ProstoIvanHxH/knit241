package org.knit.solutions.Task18;

import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//        int[] arr = new int[]{1,0,2,3,0,4,5,0};
        int[]  arr = IntStream.generate(() -> new Random().nextInt(10)).limit(10000).toArray();
        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println();

        long startTime = System.nanoTime();


        duplicateZeros(arr);
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println(timeElapsed+"  kjn");
    }

    public static void duplicateZeros(int[] arr) {
        int l = arr.length-1;
        for (int i = 0; i < l; i++) {
            if (arr[i] == 0 && i< l) {
                for (int j = l; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i++;
            }
        }
    }


}
