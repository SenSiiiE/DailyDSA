package com.oops;

import java.util.HashSet;

public class testCase {
    public static void main(String[] args) {
        System.out.println();
    }
    static int[] removeDuplicate(int[] v){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < v.length; i++) {
            set.add(v[i]);
        }
//        return set.toArray();
    return v;
    }
}
