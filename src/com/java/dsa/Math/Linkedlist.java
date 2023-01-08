package com.java.dsa.Math;



public class Linkedlist {
    Node head;

    //Node(1)->Node(2)
    static class Node {
        int key;
        Node next;

        Node(int k) {
            key = k;
            next = null;
        }
    }

    public static void main(String[] args) {
        Linkedlist linklist = new Linkedlist();
        System.out.println(linklist.head);
        linklist.head = new Node(10);
        System.out.println(linklist.head);
//        System.out.println(head.next);
        Node node2 = new Node(20);
        linklist.head.next = node2;
        linklist.head.next.next = new Node(30);
        linklist.head.next.next.next = new Node(40);
        display(linklist.head);
        int pos=3; int data=25;
        insert(linklist.head, data, pos);
        display(linklist.head);

    }
    static void display(Node head)
    {
        Node current=head;
        while(current!=null)
        {
            System.out.println(current.key);
            System.out.println("address "+current.next);
            current=current.next;
        }
    }
    static void insert(Node head,int data,int pos)
    {
        Node NodeIns=new Node(data);
        if (head==null)
        {
            head=NodeIns;
        }
        Node current=head;

        int i=1;
        while(i<pos-1)
        {
            current=current.next;
            i+=1;
        }
        //10->20->NodeIns->temp
        // temp30->40
        Node temp=current.next;
        current.next=NodeIns;
        current.next.next=temp;
    }
}



