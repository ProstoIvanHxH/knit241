package org.knit.solutions.Task19;

import java.util.Arrays;

public class Zip {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int point1=m-1,point2=n-1,index=n+m-1;
        while (index>=0&&point2>=0){
            if (point1 >= 0 && nums1[point1] > nums2[point2]) {
                nums1[index] = nums1[point1];
                point1--;
            } else {
                nums1[index] = nums2[point2];
                point2--;
            }
            index--;
        }
    }
}