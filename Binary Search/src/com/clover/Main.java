package com.clover;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Find the smallest number in a sorted reversed list
        System.out.println("Using the Changed Place to find the Smallest:");
        System.out.println(SmallestInReversedArrayChangedPoint.findSmallest(new int[]{2,3,4,5,1}));
        System.out.println("Using the Left Place to find the Smallest:");
        System.out.println(SmallestInReversedArrayLeftIndex.findSmallest(new int[]{3,4,5,1,2}));
        System.out.println("Numbers may Repeat and find the smallest:");
        System.out.println(SmallestInRepeatReversedArray.findSmallest(new int[]{1,1,1,0,1}));

        System.out.println("Find if the target exist in a Rotated repeat Array:");
        System.out.println(FindItemInRepeatRotateArray.search(new int[]{3,4,5,5,1,2},3));

        System.out.println("Count the numbers of a target in a Sorted Array:");
        System.out.println(CountNumInRotateArray.getNumberOfK(new int[]{1,2,2,3,3,3,4,4,4,4,5,5,6},4));


    }
}
