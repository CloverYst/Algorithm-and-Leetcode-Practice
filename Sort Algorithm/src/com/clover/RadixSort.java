package com.clover;

import java.util.Arrays;

public class RadixSort {
    public static int[] sort(int[] source){
        int[] arr = Arrays.copyOf(source,source.length);

        int maxDigit= getMaxDigit(arr);
        return radixSort(arr,maxDigit);

    }
    private static int getMaxDigit(int[] arr){
        int maxVaule=getMaxValue(arr);
        return getNumLength(maxVaule);
    }
    private static int getMaxValue(int[] arr){
        int maxValue = arr[0];
            for (int value : arr) {
            if (maxValue < value) {
                maxValue = value;
            }
        }
            return maxValue;
    }
    private static int getNumLength(long num){
        if(num==0)
            return 1;
        int length =0;
        for(long temp=num;temp!=0;temp/=10){
            length++;
        }
        return length;
    }
    private static int[] radixSort(int[] arr, int maxDigit){
        int mod=10, dev=1;
        for(int i=0;i<maxDigit;i++,dev*=10,mod*=10){
            int[][] counter= new int[mod*2][0];
            for(int j=0;j<arr.length;j++){
                int bucket=((arr[j]%mod)/dev)+mod;
                counter[bucket]=arrayAppend(counter[bucket],arr[j]);
            }
            int pos=0;
            for(int[] bucket:counter){
                for (int value: bucket){
                    arr[pos++]=value;
                }
            }
        }
    return arr;
    }
    private static int[] arrayAppend(int[] arr,int value){
        arr=Arrays.copyOf(arr,arr.length+1);
        arr[arr.length-1]=value;
        return arr;
    }

}
