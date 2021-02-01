package com.clover;

import java.util.ArrayList;
import java.util.Arrays;

public class FindTheKSmallest {
    public static ArrayList<Integer> getKSmallest(int[] arr,int k){
        ArrayList<Integer> list = new ArrayList<>();
        if(arr ==null||k<=0||k>arr.length)
            return list;
        int[] kArray = Arrays.copyOfRange(arr,0, k);
        buildHeap(kArray);
        for (int i=k;i<arr.length;i++){
            if(arr[i]<kArray[0]){
                kArray[0]=arr[i];
                maxHeap(kArray,0);
            }
        }
        for(int i=kArray.length-1;i>=0;i--){
            list.add(kArray[i]);
        }
        return list;
    }

    private static void buildHeap(int[] input){
        for(int i=input.length/2-1;i>=0;i--){
            maxHeap(input,i);
        }
    }
    private static void maxHeap(int[] array, int i){
        int left = 2*i+1;
        int right = left+1;
        int largest = 0;
        if(left <array.length&&array[left]>array[i])
            largest = left;
        else
            largest =i;
        if(right<array.length&&array[right]>array[largest])
            largest = right;
        if(largest!=i){
            int temp=array[i];
            array[i] =array[largest];
            array[largest]=temp;
            maxHeap(array,largest);
        }
    }

}
