package com.clover;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiffWayAddParentheses {
    static Map<String, List<Integer>> map = new HashMap<>();
    public static List<Integer> diffWaysToCompute(String input){
        if(map.containsKey(input))
            return  map.get(input);
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<input.length();++i){
            char c=input.charAt(i);
            System.out.println("Char"+i+":"+c);
            if(c=='+'||c=='-'||c=='*'){
                List<Integer> list1 =diffWaysToCompute(input.substring(0,i));
                List<Integer> list2 =diffWaysToCompute(input.substring(i+1));
                System.out.println("List1"+list1);
                System.out.println("List2"+list2);
                for(int v1:list1){
                    for(int v2:list2){
                        if(c=='+')
                            res.add(v1+v2);
                        if(c=='-')
                            res.add(v1-v2);
                        if(c=='*')
                            res.add(v1*v2);
                    }
                }
            }
        }
        if(res.isEmpty())
            res.add(Integer.parseInt(input));
        map.put(input,res);
        return res;
    }
}
