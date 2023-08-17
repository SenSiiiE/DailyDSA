package com.SlidingWindow;

import java.util.*;

public class test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        ArrayList<Integer> list2 = new ArrayList<>();
        list.addAll(3, list);
        System.out.println(list);
        System.out.println(list.remove(Integer.valueOf(60)));
        System.out.println(list);

        LinkedList<Integer> link = new LinkedList<>();

//        Queue<Integer> q = new PriorityQueue<>();
//        q.add(34);
//        q.add(45);
//        System.out.println(q +"" + q.peek());
    }
}
