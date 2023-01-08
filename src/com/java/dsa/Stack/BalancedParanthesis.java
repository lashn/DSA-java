package com.java.dsa.Stack;

import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        int ans=Solution.solve("{([])}");
        System.out.println(ans);
    }

    public static class Solution {
        public static int solve(String A) {
        /*
        A={([])}
        insert char by char in stack
        for {([
        check if { as a } as next elem
        if yes top the 2 elements
        check if the next elems have closing paranth and
        */
            Stack<Character> stack = new Stack();
            int n=A.length();
            int i=0;
            while(i<n){
                char symbol=A.charAt(i);
                if (symbol == '{' || symbol == '[' || symbol =='('){
                    stack.push(symbol);
                }
                else if (symbol == '{' || symbol == '[' || symbol =='('){
                    if (stack.peek() == '{' && symbol == '}')
                        stack.pop();
                    else if (stack.peek() == '{' && symbol == '}')
                        stack.pop();
                    else if (stack.peek() == '[' && symbol == ']')
                        stack.pop();
                    else
                        return 0;
                }
                else
                    return 0;
                i++;
            }
            if (stack.size()==0)
                return 1;
            else
                return 0;
        }
    }
}
