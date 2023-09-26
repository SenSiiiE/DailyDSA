package com.binaryTree.BT;

public class Main {
    public static void main(String[] args) {
        binaryTree bt = new binaryTree();
//        bt.insertRec()
        bt.insertRoot(5);
        bt.insert();
        bt.inorder();
//        System.out.println(bt);
    }
}
