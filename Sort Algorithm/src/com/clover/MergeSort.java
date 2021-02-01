package com.clover;

import java.util.Arrays;

public class MergeSort {
    public static int[] sort(int[] array) {
        int[] nums = Arrays.copyOf(array, array.length);

        if(nums.length<2)
            return nums;

        int mid = nums.length / 2;
        int[] left= sort(Arrays.copyOfRange(nums,0,mid));
        int[] right=sort(Arrays.copyOfRange(nums,mid,nums.length));

        return merge(left,right);
    }
    public static int[] merge(int[] left,int[] right){
        int[] result= new int[left.length+right.length];
        int i=0;
        while(left.length>0&&right.length>0){
            if(left[0]>right[0]) {
                result[i++] =right[0];
                right=Arrays.copyOfRange(right,1,right.length);
            }
            else{
                result[i++] =left[0];
                left=Arrays.copyOfRange(left,1,left.length);
            }

        }
        while(left.length>0) {
            result[i++] =left[0];
            left=Arrays.copyOfRange(left,1,left.length);
        }
        while(right.length>0) {
            result[i++] =right[0];
            right=Arrays.copyOfRange(right,1,right.length);
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
