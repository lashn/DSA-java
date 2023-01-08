package com.java.dsa.Math;

public class ArmstrongNum {

    public static void main(String[] args) {
        int a=153;
//      length of a size  split num and 1**n
        int temp;
        temp=a;
        int sum=0;
        int rem;
        while (temp>0) {
            rem=temp % 10; // = 3;
            temp=temp/10;
            sum=sum+ rem*rem*rem;
        }
        if (sum==a)
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
