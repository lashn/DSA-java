package com.java.dsa.Tree;

public class Node {
    int key;
    Node left;
    Node right;
    private Node root;

    Node(int key) {
        this.key = key;
        left = right = null;
    }

    //generic and common Node with few nodes initialized
    public Node() {
        this.root=new Node(10);
        root.left=new Node(20); //1st level
        root.right=new Node(30);
        root.left.left=new Node(40);//2nd level
        root.left.right=new Node(50);
        root.right.right=new Node(70);
        root.right.right.left=new Node(80);//3rd level
        root.right.right.right=new Node(90);
    }

    //method to return
    protected Node getNode() {
        return root;
    }
}





