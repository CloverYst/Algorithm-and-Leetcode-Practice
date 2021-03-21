package com.clover;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    public ImplementStackUsingQueues(){
        q1= new LinkedList<Integer>();
        q2= new LinkedList<Integer>();
    }
    /** Push element x to the back of queue. */
    public void push(int x) {
        q1.add(x);

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int ele=-1;
        while(q1.size()!=1){
            q2.add(q1.poll());
        }
        ele=q1.poll();
        while(!q2.isEmpty()){
            q1.add(q2.poll());
        }
        return ele;

    }

    /** Get the front element. */
    public int peek() {
        int ele=-1;
        while(q1.size()!=1){
            q2.add(q1.poll());
        }
        ele=q1.poll();
        q2.add(ele);
        while(!q2.isEmpty()){
            q1.add(q2.poll());
        }
        return ele;

    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }
}
