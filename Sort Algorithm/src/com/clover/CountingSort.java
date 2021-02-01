package com.clover;

import java.util.Arrays;

public class CountingSort {
    public static int[] countSort(int[] arr){
        int max= getMax(arr);
        int[] countArray =new int[max+1];
        //int[] temp = arr;
        int[] temp = new int[arr.length];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        for(int i=0;i<arr.length;i++){
            countArray[arr[i]]++;
        }
        for(int i=1;i<countArray.length;i++){
            countArray[i]=countArray[i]+countArray[i-1];
        }
        for(int i=0;i<temp.length;i++) {
            arr[--countArray[temp[i]]] = temp[i];
        }
        return arr;
    }
    private static int getMax(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
}
