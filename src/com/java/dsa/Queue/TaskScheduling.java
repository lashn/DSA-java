package com.java.dsa.Queue;
import java.util.Deque;
import java.util.LinkedList;

public class TaskScheduling {
    public static void main(String[] args) {
        int ans = tasks(new int[]{2, 3, 1, 5, 4},new int[]{1, 3, 5, 4, 2});

    }
    public static int tasks(int[] A, int[] B) {
        /*
        A=2 3 1 5 4
        B=1 3 5 4 2

        Q=2 3 1 5 4
        B=1
        till we get B[i]==que.peekFirst()
            perform queue removeFirst and addLast
            c++
        if B[i]==que..peekFirst()
            que.removeFirst()
            c++

        */
        Deque<Integer> deq = new LinkedList();
        int n=A.length;
        for (int i=0; i<n;i++){
            deq.addLast(A[i]);
        }
        int i=0;
        int c=0;
        while(!deq.isEmpty()){
            if (deq.peekFirst()==B[i]){
                deq.removeFirst(); //1==1
                c++;
            }
            else{
                while(!deq.isEmpty()){
                    deq.addLast(deq.removeFirst());
                    c+=1;
                    if (deq.peekFirst()==B[i]){
                        deq.removeFirst();
                        c++;
                        break;
                    }
                }
            }
            i++;
        }
        return c;
    }
}
