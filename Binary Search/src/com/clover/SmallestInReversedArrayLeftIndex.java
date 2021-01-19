package com.clover;

public class SmallestInReversedArrayLeftIndex {
    public static int findSmallest(int[] array){
        if(array==null||array.length==0)
            return -1;
        int left=0, right= array.length-1;
        while(left<right){
            int mid =left + (right - left) / 2;
            if (array[mid]>array[right])
                left=mid+1;
            else
                right = mid;
        }
        return array[left];
    }
}
