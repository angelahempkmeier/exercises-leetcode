package org.example;

import java.util.Arrays;

public class Test {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        for (int i = 0; i < m; i++){
            if(nums1[i] > nums1[i+1]){
                arr[i] = nums1[i+1];
            }else {
                arr[i] = nums1[i];
            }
        }
        System.out.println(arr);
    }
}
