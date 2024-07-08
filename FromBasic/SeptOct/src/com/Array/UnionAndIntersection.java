package com.Array;

import java.util.*;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int[] a = {1,3,5,7};
        int[] b = {2,4,6,7,8,9};
        union(a, b);
//        intersection(a, b);
    }

//    static void intersection(int[] a, int[] b) {
//        int
//    }

    static void union(int[] a, int[] b){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int n: a) set.add(n);
        for(int n: b) set.add(n);
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        a[0] = l.get(0);
        Map<Character, Integer> map = new HashMap<>();
//        for(Map.Entry<Character, Integer> entry : map.entrySet()) entry.getKey()
        System.out.println((char) 97);
//        map.
    }
}
