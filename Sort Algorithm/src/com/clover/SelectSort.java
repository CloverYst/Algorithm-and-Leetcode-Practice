package com.clover;

import java.util.Arrays;

public class SelectSort {
    public static int[] sort(int[] array){
        int[] nums = Arrays.copyOf(array,array.length);
        for(int i= 0;i<nums.length-1;i++){
            int min=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[min])
                    min=j;
            }
            if(min!=i){
                int temp=nums[i];
                nums[i]=nums[min];
                nums[min]=temp;
            }
            System.out.println(Arrays.toString(nums));
        }
        return nums;
    }
}
