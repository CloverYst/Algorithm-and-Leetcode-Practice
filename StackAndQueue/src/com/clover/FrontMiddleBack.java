package com.clover;

import java.util.Deque;
import java.util.LinkedList;

public class FrontMiddleBack {
    private Deque<Integer> q1,q2;
    public FrontMiddleBack(){
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    public void pushFront(int val){
        q1.addFirst(val);
        if(q1.size()>q2.size()){
            q2.addFirst(q1.removeLast());
        }
    }
    public void pushMiddle(int val){
        if(q1.size()<q2.size())
            q1.addLast(val);
        else
            q2.addFirst(val);
    }
    public void pushBack(int val){
        q2.addLast(val);
        if(q2.size()>q1.size()+1){
            q1.addLast(q2.removeFirst());
        }
    }
    public int popFront(){
        int res=-1;
        if(q1.size()>0){
            res=q1.removeFirst();
            if(q2.size()>q1.size()+1){
                q1.addLast(q2.removeFirst());
            }
        }else if(q2.size()>0)
        {
            res=q2.removeFirst();
        }
        return  res;
    }
    public int popMiddle(){
        int res=-1;
        if(q2.size()>q1.size()){
            res=q2.removeFirst();
        }else if(q1.size()>0&&q1.size()==q2.size()){
            res=q1.removeLast();
        }
        return res;
    }
    public int popBack(){
        int res=-1;
        if(q2.size()>q1.size()){
            res=q2.removeLast();
        }else if(q1.size()>0&&q1.size()==q2.size()){
            res = q2.removeLast();
            q2.addFirst(q1.removeLast());
        }
        return res;
    }
}
