package com.java.dsa.Searching;

public class SortwithMiddleUnsorted {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        //{3,4,5,9,8,7,6,10,11}
        /*
        0 1 2 3 4 5 6  7  8
        3,4,5,9,8,7,6,10,11
        3,4 5 6 7 8 9 10 11
        s=3 e=6
        Brute O(N~2)
        if i+1 < i
            start
        if i+1> i
            end
        reverse(arr, start, end)

        O(N) - Binary search
        ----
        mid=l+h/2
        if i+1 < i
            start
        if i+1> i
            end
        reverse(arr, start, end)

        */
        int[] arr = {3,4,5,9,8,7,6,10,11};
        //get start
        int n=arr.length;
        int low=0;
        int high=n;

        /*
        1 4 3 5
        l h mid
        1 4 2


        mid mid-1 mid+1
        */
        /*
        0 1 2 3 4 5 6  7  8
        3,4,5,9,8,7,6,10,11
        3,4 5 6 7 8 9 10 11
        */
        int start=getStart(arr,low,high);
        int end=getEnd(arr,low,high);
        int[] ans=reverse(arr,start,end);
        System.out.println("start "+start+" end "+end);
        // System.out.println(ans);
        for (int i=0; i<ans.length; i++)
        {
            System.out.print(ans[i]);
        }

    }

    static int getStart(int[] arr,int low,int high){
        while(low<high){
            int mid=(low+high)/2;
            //1 4 3 5
            //find mid-1 or mid+1 where the sort order changes
            if(arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if (mid>0 && arr[mid]<arr[mid-1]){
                //move to right side
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return 0;
    }

    static int getEnd(int[] arr,int low,int high){
        while(low<high){
            int mid=(low+high)/2;
            /*
            0 1 2 3
            1 4 3 5
            l h mid
            1 4 2
            */
            //find mid-1 or mid+1 where the sort order changes
            if(arr[mid]<arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid-1;
            }
            else if (arr[mid]>arr[mid-1]){
                //move to right side
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return 0;
    }

    static int[] reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
        return arr;
    }
}
