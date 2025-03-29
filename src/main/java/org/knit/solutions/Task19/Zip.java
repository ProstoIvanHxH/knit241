package org.knit.solutions.Task19;

import java.util.Arrays;

public class Zip {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] temporaryArray = Arrays.copyOf(nums1, m + n);
        int temporaryArrayPointer = 0, array1Pointer = 0, array2Pointer = 0;
        int l=n+m;
        while (array1Pointer < l) {

            if ((temporaryArray[temporaryArrayPointer] > nums2[array2Pointer] || temporaryArray[temporaryArrayPointer] == 0)) {
                nums1[array1Pointer] = nums2[array2Pointer];
                array1Pointer++;
                array2Pointer++;

                if (array1Pointer<l)
                nums1[array1Pointer] = temporaryArray[temporaryArrayPointer];
            } else {

                nums1[array1Pointer] = temporaryArray[temporaryArrayPointer];
                temporaryArrayPointer++;
                array1Pointer++;
            }
        }
    }
}