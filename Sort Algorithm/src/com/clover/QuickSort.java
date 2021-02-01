package com.clover;

import java.util.Arrays;

public class QuickSort {
    public static int[] sort(int[] array){
        int[] nums = Arrays.copyOf(array, array.length);

        int i=0,j=nums.length-1;
        return  quickSort(nums,i,j);
    }
    public static int[] quickSort(int[] nums, int low, int high){

        if(low<high){
            int pivot=low;
            int j= pivot+1;//slow pointer
            for (int i = j; i <= high; i++) {
                if (nums[i] < nums[pivot]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j++;
                }
            }

            int temp = nums[pivot];
            nums[pivot] = nums[j-1];
            nums[j-1] = temp;

            System.out.println(Arrays.toString(nums));

            quickSort(nums, low, j-1- 1);
            quickSort(nums, j, high);
        }


        return nums;

    }
}
