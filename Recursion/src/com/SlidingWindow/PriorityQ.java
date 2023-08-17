package com.SlidingWindow;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQ {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());

        q.add(10);
        q.add(3);
        q.add(100);
        System.out.println(q);
        q.poll();
        System.out.println(q);

    }
}
