package com.java.dsa.Sorting;

public class InverstionCount {
    public static void main(String[] args) {
        int A[]= {3, 2, 1};
        int res= invCount(A);
    }
    public static int invCount(int[] A) {
        /*
            A= 3 2 1
            op=3
            i<j
            A[i]>A[j]

            brute force
            traverse array
            count var
            for i and j in 0 to n
                if A[i]>A[j] {
                    count++
                }
        */
        int n=A.length;
        int count=0;
        for (int i=0; i<n; i++) {
            for (int j =i; j<n;j++) {
                if (A[i]>A[j]){
                    count++;
                }
            }
        }
        return count;

    }
}
