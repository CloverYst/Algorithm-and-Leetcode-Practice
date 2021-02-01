package com.clover;

import java.util.Arrays;

public class BucketSort {
    public static int[] sort(int[] array){
        int[] arr= Arrays.copyOf(array,array.length);

        return bucketSort(arr,5);
    }

    private static int[] bucketSort(int[] arr,int bucketSize){
        if(arr.length==0)
            return arr;
        int minVal = arr[0], maxVal= arr[0];
        for(int value: arr){
            if(value<minVal)
                minVal = value;
            else if(value>maxVal)
                maxVal=value;
        }
        int bucketCount= (int) Math.floor((maxVal-minVal)/bucketSize);

        int[][] buckets= new int[bucketCount][0];
        for(int i=0;i<arr.length;i++){
            int index = (int) Math.floor((arr[i]-minVal)/bucketSize);
            buckets[index]=arrAppend(buckets[index],arr[i]);
        }

        int arrIndex=0;
        for(int[] bucket:buckets){
            if(bucket.length<=0)
                continue;
            bucket=InsertionSort.sort(bucket);
            for(int value:bucket){
                arr[arrIndex++]=value;
            }
        }
    return arr;
    }
    private static int[] arrAppend(int[] arr, int value){
        arr = Arrays.copyOf(arr,arr.length+1);
        arr[arr.length-1]=value;
        return arr;
    }

}
