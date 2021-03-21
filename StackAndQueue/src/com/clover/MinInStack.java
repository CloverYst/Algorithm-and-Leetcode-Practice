package com.clover;

import java.util.Stack;

public class MinInStack {
    private Stack<Integer> st1 = new Stack<>();
    private Stack<Integer> st2 = new Stack<>();

    public void push(int node){
        st1.push(node);
        if(st2.isEmpty())
            st2.push(node);
        else{
            if(st2.peek()>node){
                st2.push(node);
            }
        }
    }

    public int pop(){
        if(st1.peek()==st2.peek())
            st2.pop();
        return st1.pop();
    }

    public int top(){
        return st1.peek();
    }

    public int min(){
        return st2.peek();
    }

}
