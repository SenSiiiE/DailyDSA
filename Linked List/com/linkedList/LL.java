package com.linkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }

    public int length(){
        return this.size;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
        }
        else
        {
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
        } else if (index == size) {
            insertLast(val);
        }else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            Node node = new Node(val, temp.next);
            temp.next = node;
        }
    }

    public void insertRec(int index, int value){
        insertRec(index, value, head);
    }
    private Node insertRec(int index, int value, Node node){
        if(index == 0){
            Node temp = new Node(value, node);
            size++;
            return temp;
        }
        node.next = insertRec(index - 1, value, node.next);
        return node;
    }

    public void deleteFirst(){
        if(head == null) {
            System.out.println("List is empty...");
            return;
        }
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        System.out.println("Deleted node value is: " + val);
    }

    public void deleteLast(){
        if(tail == head){
            deleteFirst();
        } else if (tail == null) {
            System.out.println("List is Empty...");
        } else {
            Node temp1 = head;
            Node temp2 = head;
            while(temp2.next != null){
                temp1 = temp2;
                temp2 = temp2.next;
            }
            tail = temp1;
            tail.next = null;
            System.out.println("Deleted value of node: " + temp2.value);
        }
    }

    public void delete(int index){
        if (index < 0){
            System.out.println("Invalid position");
        } else if (index == 0) {
            deleteFirst();
        } else if (head == null){
            System.out.println("List is empty");
        } else {
            Node node = head;
            for(int i = 1; i< index; i++){
                node = node.next;
            }
            System.out.println("Deleted value of node is: " + node.next.value);
            node.next = node.next.next;
        }
    }

    public LL merge(LL first, LL second){
        Node f = first.head;
        Node s = second.head;
        LL ans = new LL();
        while(f != null && s != null){
            if(f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            }else{
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while(f != null){
            ans.insertLast(f.value);
            f = f.next;
        }
        while(s != null){
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }
    public void reverse(){
        reverse(head);
    }
    private void reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }


    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    private int getValue(int num){
        Node node = head;
        int index = 0;
        while(node != null){
            if(node.value == num) return index;
            index++;
            node = node.next;
        }
        return -1;
    }
    private Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    private class Node{
        private int value;
        private Node next;
        public Node(){}
        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


}
