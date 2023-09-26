package com.codingRound;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class removeDup {
    public static void main(String[] args) {
        System.out.println(remove(new int[] {1,1,2,3,4,5}));
    }
    static HashSet<Integer> remove(int[] a){
        HashSet<Integer> set = new LinkedHashSet<>();
        for(int i : a){
            set.add(i);
        }
        return set;
    }
}
