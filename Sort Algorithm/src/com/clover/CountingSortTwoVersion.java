package com.clover;

public class CountingSortTwoVersion {
    public static int[] countSort(int[] arr){
        int max = findMax(arr);

        return sorting(arr,max);
    }
    private static int[] sorting(int[] arr,int max){
        int[] countArray = new int[max+1];
        for(int i=0;i<arr.length;i++)
            countArray[arr[i]]++;
        int j=0;
        for(int i=0;i<countArray.length;i++){
            while(countArray[i]>0){
                arr[j++]=i;
                countArray[i]--;
            }
        }
        return arr;
    }
    private static int findMax(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max = arr[i];
        }
        return max;
    }
}
