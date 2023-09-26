package com.codingRound;

import java.util.PriorityQueue;
import java.util.Queue;

public class pyq {
    public static void main(String[] args) {
        int[] a = {2,1,3,5,4};
        System.out.println(difference(a, 4));
    }

    private static int difference(int[] a, int i) {
        Queue<Integer> queue = new PriorityQueue<>();
        for(int num: a){
            queue.add(num);
        }

        int count = 0;
        while(!queue.isEmpty() && count <= i){
            if(count == i) return a[i] - queue.poll();
            queue.poll();
            count++;
        }
        return -1;
    }
}
