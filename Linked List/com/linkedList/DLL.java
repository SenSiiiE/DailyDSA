package com.linkedList;

public class DLL {
    private Node head;
//    private Node tail;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }
    public void insertLast(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            node.prev = null;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        node.prev = temp;
        temp.next = node;
        node.next = null;
    }
    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("NULL");
    }
    public void displayRev(){

    }
    private class Node{
        int value;
        Node next;
        Node prev;
        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
