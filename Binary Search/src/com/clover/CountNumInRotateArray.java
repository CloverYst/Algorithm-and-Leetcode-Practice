package com.clover;

import java.util.Arrays;

public class CountNumInRotateArray {
    public static int getNumberOfK(int[] nums, int target){
        if(nums==null || nums.length==0)
            return -1;
        if(nums.length==1)
            return nums[0]==target?1:0;
        int result=0;
        int mid = (nums.length-1)/2;
        if(target<nums[mid])
            result+=getNumberOfK(Arrays.copyOfRange(nums,0,mid),target);
        else if(target>nums[mid])
            result+=getNumberOfK(Arrays.copyOfRange(nums,mid+1,nums.length),target);
        else
            result+=getCount(nums,mid);

        return result;
    }
    public static int getCount(int[] nums, int mid){
        int k= nums[mid];
        int result=0;

        for(int i=mid;i<nums.length;i++){
            if(nums[i]==k)
                result++;
            else
                break;
        }
        for(int i=mid-1;i>=0;i--){
            if(nums[i]==k)
                result++;
            else
                break;
        }
        return result;
    }
}
