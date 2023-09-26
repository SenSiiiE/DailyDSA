package com.binaryTree.BT;

import com.sun.source.tree.Tree;

import java.util.Scanner;

public class binaryTree {
    Node root;
    Node left;
    Node right;
    binaryTree(){

    }
    Scanner sc = new Scanner(System.in);
    public void insertRoot(int val){
        root = new Node(val);
        root.val = val;
    }
    public void insert(){
        root = insertRec(root);
    }
    private Node insertRec(Node root){
        System.out.print("Do u want to add another Node? (0/1) to " + root.val + ":");
        int choice = sc.nextInt();
        if(choice != 0){
            Node left = insertRec(root.left);
            Node right = insertRec(root.right);
        }
        return root;
    }
    public void inorder(){
        inorder(root);
    }
    private void inorder(Node root){
        if(root == null) return;
        else {
            inorder(left);
            System.out.println(root.val);
            inorder(right);
        }
    }
    private class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
