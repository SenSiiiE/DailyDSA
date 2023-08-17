package com.SlidingWindow;

import java.util.*;

public class MaxInSubArray {
    public static void main(String[] args) {
        System.out.println(maxInSubArray(new int[] {1, 3, -1, -3, 5, 3, 6, 7}, 3));
    }

    static ArrayList<Integer> maxInSubArray(int[] arr, int k){
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> que = new PriorityQueue<>(Comparator.reverseOrder());
        while (j < arr.length){
            if(arr[j] > max){
                max = arr[j];
            }

            if(j-i+1 < k){
                j++;
            } else if (j - i + 1 == k) {
                que.add(max);
                list.add(max);

                if(que.peek() == arr[i]){
                    que.poll();
                }
                i++;
                j++;
            }

        }
        return list;
    }
}
