package com.java.dsa.String;
//bureau id
/*
Write a function (encoder) that takes a string and outputs its encoded
form such that n adjacent characters x are converted to nx.

Examples

Input:
aabbbcccc
a:2,b:3,c:4
Output:
2a3b4c

Input:
bbccddb

Output:
2b2c2d2b

Constraints:
len(input) <= 1e6
Acceptable time complexity: O(n)

Approach:
bbccddb
traverse through
when there is a change in char

do append and for the char and the no then move

 */
public class ShortenStringOrEncode {
    public static void main(String[] args) {
        String s = "aabbbcccd";
                //  0123456
                //2b2c2d2b
        encode(s);
    }

    static void encode(String s){
        int n=s.length();
        String result="";
        //aabbbcccc
        //012345678
        //aabbbcccd
        if(n==1){
            System.out.print(1);
            System.out.print(s);
            return;
        }
        //bb ccddb
        //01 23456
//        compare i with i+1
        //when n-1 need to compare with n-2
        int count=1;
        for(int i=1;i<n;i++){
            if(s.charAt(i-1)==s.charAt(i)){
                count++;
            }
            else {
                System.out.print(String.valueOf(count)+s.charAt(i-1));
//                System.out.print(count+""+s.charAt(i-1));
                count=1; //reset count
            }
        }
        /*cases
        aabbbcccc
        it will exit without print
        aabbbcccd
        last elem wont get print
         */
        
        System.out.print(count);
        System.out.print(s.charAt(n-1));
    }

}


/*
while(i<n-1){
            // .
            //bb ccddb
            //01 23456
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
                if(i==n-2){
                    count++;
                }
            }
            else{
                System.out.print(count);
                System.out.print(s.charAt(i));
                count=1;
            }
            i++;
        }
        if(n!=1 && s.charAt(n-1)!=s.charAt(n-2)){
            System.out.print(1);
            System.out.print(s.charAt(n-1));
        }
 */