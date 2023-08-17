package com.Strings;

import java.util.*;
import java.util.stream.Collectors;

public class arrayToList {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<Integer> list11 =Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(list11);
        list11.addAll(list11);
        System.out.println(list11);

        Queue<Integer> q = new PriorityQueue<>(1);
        q.add(43);
        q.add(56);
        System.out.println(q);
        q.remove();
        System.out.println(q);
    }
}
