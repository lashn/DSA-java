package com.java.dsa.Stack;

import java.util.Stack;

public class StackMergeSort {
    public static void main(String[] args) {
        int[] A={5,17,100,11,7,108,9};

        int[] ans= Solution.sortStack(A);
        for(int i:ans){
            System.out.println(i);
        }
    }
}

class Solution {
    public static int[] sortStack(int[] A) {

        int n=A.length;
        Stack<Integer> st1 = new Stack();
        Stack<Integer> stres = new Stack();
        for (int i=0;i<n;i++){
            st1.push(A[i]);
        }
        int[] arr=new int[st1.size()];
        //split st1 to 2 and call merge function which compares the stack elements and return a stack sorted
        stres=splitStack(st1);
        for (int i=0;i<n;i++){
            arr[i]=stres.pop();
        }
        return arr;

    }

    public static Stack<Integer> reverse(Stack<Integer> st1){
        Stack<Integer> revst = new Stack();
        while(!st1.empty()){
            revst.push(st1.pop());
        }
        return revst;
    }

    public static Stack<Integer> mergeStack(Stack<Integer> st1, Stack<Integer> st2){
        Stack<Integer> stm = new Stack();
        while(!st1.empty() && !st2.empty()){
            //keep small elem at the peek
            if(st1.peek()<=st2.peek())
                stm.push(st1.pop());
            else
                stm.push(st2.pop());
        }
        while (!st1.empty()){
            stm.push(st1.pop());
        }
        while (st2.size()>0){ //using size() instead of empty
            stm.push(st2.pop());
        }
        // 1 2 3 4 -peek/top
        return reverse(stm);
    }


    public static Stack<Integer> splitStack(Stack<Integer> st1){
        if (st1.size()<=1){
            return st1;
        }
        int n=st1.size()/2;
        Stack<Integer> st2 = new Stack();
        for (int i=0; i<n;i++){
            Integer elem=st1.pop();
            st2.push(elem);
        }

        //st1 and st2
        Stack<Integer> s1=splitStack(st1);
        Stack<Integer> s2=splitStack(st2);
        return mergeStack(s1,s2);
    }
}


