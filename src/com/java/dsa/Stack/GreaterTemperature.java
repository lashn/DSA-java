package com.java.dsa.Stack;

import java.util.Arrays;
import java.util.Stack;

public class GreaterTemperature {
    public static void main(String[] args) {

    }

    public int[] nextGreater(int[] A) {
        /*
        A=4 5 2 10
          5 10 10 -1

        psuedo:
        traverse through array and if A[i+1]>A[i]
            then ans = A[i]
            lesser elems have to be discarded
        for n-1 last elem - ignore
            so loop ends at n-2
        brute:
        i trav from 0 to n-1
            j from i+1 to n-1
                if A[j]>A[i]
                 then break and add ans[i]=A[j]
        edge case for i=n-1 j =n but wont enter as j<n - implicitly works
        */
        // int n=A.length;
        // int[] arr= new int[n];
        // Arrays.fill(arr,-1);
        // for (int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if (A[j]>A[i]){
        //             arr[i]=A[j];
        //             break;
        //         }
        //     }
        // }
        // return arr;
        /*
        optimized:
        A=4 5 2 10
          5 10 10 -1

        psuedo:
        traverse through array and if A[i+1]>A[i]
            then ans = A[i]
            lesser elems have to be discarded
        for n-1 last elem - ignore
            so loop ends at n-2

        stack:
        push n-1 to stack
        traverse n-2 to 0
        compare if peek > A[i]
            update ans[i]=peek
        if all elems in stack < A[i] then all pop
        if stack size ==0
            return and already filled -1 will help

        push elem only if its greater than existing top


        A=11 4 5 2 10
             5 10 10 -1

        s
        4
        5
        10
        --
        A= 10 10 -1

        */
        //my soln failing for one case
        // int n= A.length;
        // int[] arr = new int[n];
        // Arrays.fill(arr,-1);
        // Stack<Integer> stack = new Stack();
        // stack.push(A[n-1]);
        // for (int i=n-2; i>=0;i--){
        //     while (!stack.empty() && stack.peek()<A[i]){
        //         //no greater elem on right side
        //         stack.pop();
        //     }
        //     if (!stack.empty()){
        //         arr[i]=stack.peek();
        //         stack.push(A[i]);
        //     }
        //     else
        //         stack.push(A[i]);
        // }
        // return arr;

        //provided soln
        Stack< Integer > s = new Stack < > ();
        s.push(0);
        int n = A.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        for (int i = 1; i < n; i++) {
            if (s.isEmpty()) {
                s.push(i);
                continue;
            }
            // find the elements whose next greater element is A[i]
            while (!s.isEmpty() && A[s.peek()] < A[i]) {
                ans[s.peek()] = A[i];
                s.pop();
            }
            s.push(i);
        }
        return ans;
    }
}

