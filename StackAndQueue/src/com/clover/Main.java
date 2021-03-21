package com.clover;


import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //1.Get the min of push in the stack
        MinInStack min = new MinInStack();

        for (int i = 1; i <= 10; i++) {
            int num = (int)(Math.random() * (i*10));
            min.push(num);
        }
        System.out.println(min.top());
        System.out.println(min.pop());
        System.out.println(min.min());
        System.out.println("*******************************");

        //2.if the second sequence is the pop order of the first sequence while the first is the push order
        var sq1 = new int[]{1,2,3,4,5};
        var sq2 = new int[]{4,5,3,2,1};
        System.out.println(IsPopOrder.isPopOrder(sq1,sq2));
        System.out.println("*******************************");

        //
        String s = "([)]";
        System.out.println("If s is valid: "+ValidParentheses.isValid(s));
        System.out.println("*******************************");


        //
        String input ="2*3-4*5";
        List<Integer> diffWays = DiffWayAddParentheses.diffWaysToCompute(input);
        System.out.println(diffWays);
        System.out.println("*******************************");


        //Leetcode150 reversed Polish Notation
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(ReversePolishNotation.evalRPN(tokens));
        System.out.println("*******************************");


        //Leetcode 225  Implement Stack using Queues
        ImplementStackUsingQueues obj = new ImplementStackUsingQueues();
        obj.push(1);
        obj.push(2);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();
        System.out.print(param_2);
        System.out.print("  ");
        System.out.print(param_3);
        System.out.print("  ");
        System.out.println(param_4);
        System.out.println("*******************************");


        //Leetcode1670. Design Front Middle Back Queue
        FrontMiddleBack objj = new FrontMiddleBack();
        objj.pushFront(1);
        objj.pushBack(2);
        objj.pushMiddle(3);
        objj.pushMiddle(4);
        int param_9 = objj.popFront();
        int param_5 = objj.popMiddle();
        int param_6 = objj.popMiddle();
        int param_7 = objj.popBack();
        int param_8 = objj.popFront();
        System.out.println(param_9+" "+param_5+" "+param_6+" "+param_7 + " "+ param_8);


    }
}
