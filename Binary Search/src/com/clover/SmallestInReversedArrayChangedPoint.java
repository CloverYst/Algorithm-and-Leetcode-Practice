package com.clover;

public class SmallestInReversedArrayChangedPoint {
    public static int findSmallest(int[] arrays){
        if(arrays == null ||arrays.length==0)
            return -1;
        if(arrays.length==1 || arrays[arrays.length-1]>arrays[0])
            return arrays[0];
        int left =0, right = arrays.length-1;
        while (left<=right) {
            int mid = left + (right - left) / 2;
            if(arrays[mid]>arrays[mid+1]) {
                return arrays[mid + 1];
            }
            if (arrays[mid-1]>arrays[mid]) {

                return arrays[mid];
            }
            if (arrays[mid]>arrays[0]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
