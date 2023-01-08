//package com.java.dsa.Sorting;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class MergeTwoSortedArrays {
//
//}
//
//public class Solution {
//    public ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {
//
//        /*
//        A=[4,7,9]
//        B=[2,11,19]
//        2,4,7,11,19
//        brute force
//        while i<m;j<n{
//            if A[i]<B[j]{
//                res.add([A[i]])
//                i++
//            }
//            else{
//                res.add[B[j]]
//                j++
//            }
//
//
//        }
//        for i in A{
//
//        }
//        */
//        int n=A.size();
//        int m=A.size();
//        int i=0,j=0;
//        ArrayList<Integer> res = new ArrayList();
//        while (i<n && j<m){
//            if (A[i]<B[j]){
//                res.add(A.get(i));
//                i++;
//            }
//            else{
//                res.add(A.get(j));
//                j++;
//            }
//        }
//        System.out.println(i+j);
//        if (i<n){
//            res.add
//        }
//        return res;
//    }
//}
