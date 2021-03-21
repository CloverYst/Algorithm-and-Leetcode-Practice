package com.clover;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    private Stack<Integer> s1;
    private Stack<Integer> s2;
    public ImplementQueueUsingStacks(){
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }
    /** Push element x to the back of queue. */
    public void push(int x){
        s1.push(x);
    }
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int ele=-1;
        while(s1.size()!=1){
            s2.push(s1.pop());
        }
        ele=s1.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return ele;
    }
    /** Get the front element. */
    public int peek() {
        int ele=-1;
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        ele=s2.peek();
        s2.push(ele);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return ele;
    }
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty();
    }

}
