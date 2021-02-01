package com.clover;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianFinder {

    private int count =0;
    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;

    /** initialize your data structure here. */
    public MedianFinder() {
        maxHeap = new PriorityQueue<>(16, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return o2.compareTo(o1);
            }
        });
        minHeap = new PriorityQueue<>();

    }

    public void addNum(int num) {
        count++;
        if((count&1)==1){
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        }else{
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        }

    }

    public double findMedian() {
        if(count ==0)
            return Double.NaN;
        if((count&1)==1){
            return Double.valueOf(maxHeap.peek());
        }else{
            return Double.valueOf(minHeap.peek()+maxHeap.peek())/2;
        }

    }
}
