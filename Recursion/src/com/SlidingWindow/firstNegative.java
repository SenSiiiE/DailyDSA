package com.SlidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class firstNegative {
    public static void main(String[] args) {
        int[] arr = {12,-1,-7,8,-15,30,16,28};
        System.out.println((negative(arr, 3)));
    }

    static ArrayList<Integer> negative(int[] arr, int k ){
        int i = 0;
        int j = 0;
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        while(j< arr.length){
            if(arr[j] < 0){
               queue.add(arr[j]);
            }
            if(j-i+1 < k){
                j++;
            } else if (j-i+1 == k) {
                if(queue.isEmpty()){
                    list.add(0);
                }else{
                    list.add(queue.peek());
                    if(arr[i] == queue.peek()){
                        queue.remove();
                    }
                }
                i++;
                j++;
            }

        }
        return list;
    }
}
