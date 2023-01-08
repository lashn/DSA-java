package com.java.dsa.String;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        int ans=lengthOfLongestSubstring("abcabcbb");
        System.out.println(ans);
    }
    public static int lengthOfLongestSubstring(String A) {
        /*
          0 1 2 3 4 5 6 7
        A=a b c a b c d b

          0   2 3
          -----
            -----
              -----
                -------
                   ------
                     ----

        A= b a b c
           ---
        op=3
        ans=A.length
        add elem to hs - inc j value
        when elem in hs - dec i value
            ans=j-i+1

            i j ans
            5 7  3
        break when j>n
        */
        int n=A.length();
        Set<Character> hs=new HashSet();
        int i=0;
        int j=0;
        int ans = 0;
        while(j<n){
            if (hs.contains(A.charAt(j)))
            {
                hs.remove(A.charAt(i));
                i++;
            }
            else{
                hs.add(A.charAt(j));
                j++;
                // ans=Math.max(ans,j-i);
                ans=Math.max(ans,hs.size());
            }
        }
        return ans;

    }
}

