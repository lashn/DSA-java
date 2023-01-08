package com.java.Method;

public class CallbyValue {
    public static void main(String[] args) {
        Integer a=10;
        Integer b=20;
        Swap s=new Swap();
        int result[] = s.Swapnum(a,b); //modifying to use a swap class
//        int result[]=Swap(a,b); //as int is primitive
        System.out.println("a,b:"+a+" "+b);
        System.out.println("swap result :"+result[0]+" "+result[1]);
    }
}

class Swap {
     int[] Swapnum(Integer a, Integer b) {
        int temp=b;
        b=a;
        a=temp;
        int ans[]={a,b};
        return (ans);

    }
}
