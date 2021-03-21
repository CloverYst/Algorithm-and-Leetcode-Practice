package com.clover;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> st= new Stack<>();
        for (char c : s.toCharArray()){
            if(c=='('||c=='['||c=='{') {
                st.push(c);
            }else if(c==')'){
                if(st.empty()||st.pop()!='(')
                    return false;
            }else if(c==']'){
                if(st.empty()||st.pop()!='[')
                    return false;
            }else if(c=='}') {
                if (st.empty() || st.pop() != '{')
                    return false;
            }
        }

        return st.empty();



//        Stack<Character> stack = new Stack<Character>();
//        for (char c : s.toCharArray()) {
//            if (c == '(')
//                stack.push(')');
//            else if (c == '{')
//                stack.push('}');
//            else if (c == '[')
//                stack.push(']');
//            else if (stack.isEmpty() || stack.pop() != c)
//                return false;
//        }
//        return stack.isEmpty();

    }
}
