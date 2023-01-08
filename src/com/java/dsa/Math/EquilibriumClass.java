package com.java.dsa.Math;

import java.util.ArrayList;
import java.util.Arrays;

public class EquilibriumClass {
    public static void main(String[] args) {
        /*
        Given a sequence arr[] of size n, Write a function int equilibrium(int[] arr, int n) that returns an equilibrium index (if any) or -1 if no equilibrium index exists.
        The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
        Examples:
        Input: A[] = {-7, 1, 5, 2, -4, 3, 0}
        Output: 3
        */
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(-7, 1, 5, 2, -4, 3, 0));
        /*bruteforce
        a1+a2 == a4+a5+a6
        then a3 is equilib index
        for i=0, i=n-1
        for i - 1 to n-1{
            for j - 0 to i-1
                leftsum
            for j - i+1 to n-1
                rightsum
            if lefsum==rightsum
                return index
         */
        /* optimized approach
        prefix sum
        -7, 1, 5, 2,-4, 3, 0
        -7,-6,-1, 1,-3, 0, 0
        13 ,6, 5, 1, -1, 3, 0
         */
        //prefix sum
        int n=a.size();
        ArrayList<Integer> P = new ArrayList<>();
        P.add(a.get(0));

        for(int i=1;i<n;i++){
            P.add(P.get(i-1)+a.get(i));
        }
        System.out.println(P);
        ArrayList<Integer> S = new ArrayList<>();
        S.add(a.get(n-1));
        for(int i=n-2;i>=0;i--){
            S.add(S.get(i+1)+a.get(i));
        }
        System.out.println(S);




    }
}
