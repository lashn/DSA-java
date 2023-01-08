package com.java.dsa.Tree;

import java.lang.*;




class PrintKthNodesFromRoot {

    public static void main(String args[])
    {
        Node rootNodeObj= new Node();
        Node root= rootNodeObj.getNode();

        int k=2;
        int i=0;
        printknode(root,k,i);
    }

    public static void printknode(Node head, int k, int i)
    {
        Node curr = head;
        if(curr==null)  {
            return;
        }

        if (i==k)
        {
            System.out.print(curr.key +" ");
            return;
        }
        i++;
        printknode(curr.left,k,i);
        printknode(curr.right,k,i);

}}