package org.knit.solutions.Task19;

public class Main {
    public static void main(String[] args) {
        Zip zip = new Zip();
        int[] arr1 =new int[]{1,2,3,0,0,0};
        int[] arr2 =new int[]{2,5,6};
        int m=3,n=3;
        zip.merge(arr1,m,arr2,n);
        for (int i : arr1) {
            System.out.print(i);
        }
    }
}
