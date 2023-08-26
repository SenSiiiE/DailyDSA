package com.linkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(13);
//        list.insertFirst(9);
//        list.insertFirst(7);
//        list.insertFirst(5);
//        list.insertLast(99);
//        list.display();
//        System.out.println(list.length());
//
//        list.insert(560, list.length());
//        list.display();
////        System.out.println(list.deleteFirst());
//        list.deleteFirst();
//        list.display();
//        list.deleteLast();
//        list.display();
//        list.delete(2);
//        list.display();

//        DLL list = new DLL();
//        list.insertFirst(13);
//        list.insertFirst(9);
//        list.insertFirst(7);
//        list.insertFirst(5);
//        list.display();
//        list.insertLast(999);
//        int choice = 1;
//        Scanner sc = new Scanner(System.in);
//        while(choice == 1){
//            list.insertFirst(sc.nextInt());
//            System.out.println("Do you want to continue? (0/1)");
//            choice = sc.nextInt();
//        }
//        list.display();

        LL list = new LL();
        list.insertLast(15);
        list.insertLast(16);
        list.insertLast(17);
        list.display();

        list.insertRec(list.length(), 99);
        list.display();

        LL list2 = new LL();
        list2.insertLast(5);
        list2.insertLast(6);
        list2.insertLast(7);
        list2.display();

        list2.reverse();
        list2.display();
        System.out.println(list2.length());
    }
}
