package com.java.dsa.Searching;

public class SquareRootFloorinLogN {
    public static void main(String[] args) {
        Solution s = new Solution();
        int ans=s.sqrt(2147483647);
        System.out.println(ans);
    }

    public static class Solution {
        public int sqrt(int A) {
        /*
        floor of sqrt(A)
        brute force
        i*i<A
        break loop when cond fails and return i which is the floor

        efficient:
        binary search to get the mid
        target: floor - sqrt(A)

        A=11
        i = 1 2 3 4 5 6 7 8 9 10 11
        l  h   m sqrt
        0  11  5 25
        0  4   2 9
        5  4

        space: 1 to A
        set low 1 high A
        int mid = (l+h)//2
        if checksqrt func==A:
            return mid
        if checksqrt func>A:
            //move left side
            h=m-1
        elseif checksqrt func<A:
            ans=mid
            //move right side
            l=m+1
        */

            int l=1;
            int h=A;
            int ans=0;
            while(l<=h){
                int mid=(l+h)/2;

                if (mid==A/mid && A%mid==0){
                    return mid;
                }

                else if (mid<=A/mid) {
                    ans=mid;
                    l=mid+1;
                }
                else
                    h=mid-1;
            }
            return ans;
        }
    }
}





