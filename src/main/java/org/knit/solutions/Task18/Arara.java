package org.knit.solutions.Task18;

public class Arara {
    public void duplicateZeros(int[] arr) {
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
