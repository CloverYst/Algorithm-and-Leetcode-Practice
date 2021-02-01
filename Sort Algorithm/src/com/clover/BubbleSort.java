package com.clover;

import java.util.Arrays;

public class BubbleSort {
    public static int[] sort(int[] arrays){
        int[] nums= Arrays.copyOf(arrays,arrays.length);

        for(int i=1;i<nums.length;i++){
            for (int j=0;j<nums.length-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
                System.out.println(Arrays.toString(nums));
            }
        }
        return nums;
    }

}
