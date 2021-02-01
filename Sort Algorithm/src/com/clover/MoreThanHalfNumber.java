package com.clover;

import java.util.Arrays;
import java.util.HashMap;

public class MoreThanHalfNumber {
    public static int find(int[] arr){

        HashMap<Integer,Integer> map =new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i])+1 );
            else
                map.put(arr[i], 1 );
            if(map.get(arr[i])>=arr.length/2)
                return arr[i];
        }
        return 0;
    }

    public static int quickSortFind(int[] arr){
        int[] nums= Arrays.copyOf(arr,arr.length);
        int[] result =QuickSort.sort(nums);
        return result[result.length/2];
    }

    public static int moreThanHalfNum(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
            System.out.println("count:"+count);
            System.out.println("candidate:"+candidate);
        }

        return checkMoreThanHalf(nums, candidate) ? candidate : 0;
    }
    private static boolean checkMoreThanHalf(int[] array, Integer number) {
        int times = 0;
        for (int i : array) {
            if (i == number) {
                times++;
            }
        }
        return times * 2 >= array.length;
    }

}
