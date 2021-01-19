package com.clover;

import java.util.HashMap;

public class SmallestInRepeatReversedArray {
    public static int findSmallest(int[] nums) {
        if(nums==null||nums.length==0)
            return -1;

        int left=0, right= nums.length-1;
        while(left<right){
            int mid =left + (right - left) / 2;
            if (nums[mid]>nums[right])
                left=mid+1;
            else if(nums[mid]<nums[right])
                right = mid;
            else
                right--;
        }
        return nums[left];


    }
}
