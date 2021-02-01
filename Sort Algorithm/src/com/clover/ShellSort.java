package com.clover;

import java.util.Arrays;

public class ShellSort {
    public static int[] sort(int[] array){
        int[] nums = Arrays.copyOf(array,array.length);
        for(int step =nums.length/2;step>0;step/=2){
            for (int i=step;i<nums.length;i++){
                int j=i;
                int temp = nums[j];
                while(j-step>0&&nums[j-step]>temp){
                    nums[j]=nums[j-step];
                    j=j-step;
                }
                nums[j]=temp;
                System.out.println(Arrays.toString(nums));
            }
        }

        return nums;
    }
}
