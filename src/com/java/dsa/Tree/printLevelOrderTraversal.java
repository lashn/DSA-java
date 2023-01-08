package com.java.dsa.Tree;

import java.util.LinkedList;
import java.util.Queue;

////Breadth First Traversal
public class printLevelOrderTraversal {
    public static void main(String[] args) {
        Node rootNodeObj= new Node();
        Node root= rootNodeObj.getNode();
        printlevelorder(root);
    }

    public static void printlevelorder(Node root) {
        Queue<Node> que = new LinkedList<>();
        que.add(root);

        while(que.isEmpty()==false){
            Node curr=que.poll();
            System.out.println(curr.key);
            if (curr.left!=null)
                que.add(curr.left);
            if (curr.right!=null)
                que.add(curr.right);
//            System.out.println();
        }
    }
}
