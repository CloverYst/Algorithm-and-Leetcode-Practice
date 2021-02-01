package com.clover;

import java.util.Arrays;

public class InsertionSort {
    public static int[] sort(int[] array){
        int[] nums = Arrays.copyOf(array,array.length);
        for(int i=1; i<nums.length; i++){
            for(int j=i; j>0; j--){
                if(nums[j]<nums[j-1]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        System.out.println(Arrays.toString(nums));
        }
        return nums;
    }
}
