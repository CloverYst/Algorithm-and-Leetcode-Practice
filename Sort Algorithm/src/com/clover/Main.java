package com.clover;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        var array = new int[]{10,1,61,35,89,36,55};
        //BubbleSort Algorithm
        var bubbleArray=BubbleSort.sort(array);
        System.out.println(Arrays.toString(bubbleArray));
        System.out.println("---------------------------");

        //SelectSort Algorithm
        var selectArray=SelectSort.sort(array);
        System.out.println(Arrays.toString(selectArray));
        System.out.println("---------------------------");

        //InsertionSort Algorithm
        var insertArray=InsertionSort.sort(array);
        System.out.println(Arrays.toString(insertArray));
        System.out.println("---------------------------");


        //ShellSort Algorithm
        var shellArray=ShellSort.sort(array);
        System.out.println(Arrays.toString(shellArray));
        System.out.println("---------------------------");

        //MergeSort Algorithm
        var mergeArray=MergeSort.sort(array);
        System.out.println(Arrays.toString(mergeArray));
        System.out.println("---------------------------");

        //QuickSort Algorithm
        var quickArray=QuickSort.sort(new int[]{10,1,3,6,35,89,61,55});
        System.out.println(Arrays.toString(quickArray));
        System.out.println("---------------------------");


        //Find the number in an array which occurs more than half of the length of the array
        System.out.println("Use HashMap to solve:"+MoreThanHalfNumber.find(new int[]{4,10,4,3,6,4,61,4,4}));
        System.out.println("******************************");
        System.out.println("Use QuickSort to solve:"+MoreThanHalfNumber.quickSortFind(new int[]{4,10,4,3,6,4,61,4,4}));
        System.out.println("******************************");
        System.out.println("Use Mole to solve:"+MoreThanHalfNumber.moreThanHalfNum(new int[]{7,4,29,4,4,61,4}));

        //Find the K smallest numbers in the array
        var kArray = FindTheKSmallest.getKSmallest(new int[]{67,4,32,89,2,1,45,17},5);
        System.out.println("******************************");
        System.out.println("Find the K smallest:");
        System.out.println(kArray);

        //Counting Sort
        var countArr = new int[]{7,6,8,6,2,3,7,8,1,0};
        System.out.println("******************************");
        System.out.println("The original array is :"+Arrays.toString(countArr));
        System.out.println("The sorted array using the Counting sort method :"+Arrays.toString(CountingSort.countSort(countArr)));

        var countArrT = new int[]{7,6,8,6,2,3,7,8,1,0};
        System.out.println("******************************");
        System.out.println("The original array is :"+Arrays.toString(countArrT));
        System.out.println("The sorted array using the Counting sort 2.0 method :"+Arrays.toString(CountingSortTwoVersion.countSort(countArrT)));
    }
}
