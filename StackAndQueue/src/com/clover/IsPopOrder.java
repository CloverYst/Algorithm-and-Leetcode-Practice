package com.clover;

import java.util.Stack;

public class IsPopOrder {
    public static boolean isPopOrder(int[] pushArr, int[] popArr){
        if(popArr==null||popArr==null)
            return false;
        Stack<Integer> stack = new Stack<>();
        int index=0;
        for(int i=0;i<pushArr.length;i++){
            stack.push(pushArr[i]);
            while(!stack.isEmpty()&&stack.peek()==pushArr[index]){
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }

}
