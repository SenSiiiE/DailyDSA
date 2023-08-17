package com.Strings;

import java.util.ArrayList;
import java.util.List;

public class example {
    public static void main(String[] args) {
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> internal = new ArrayList<>();
        internal.add(9);
        internal.add(7);
        internal.add(8);
        outer.add (internal);
//
        System.out.println(internal.indexOf(7));
        List<Integer> ans = new ArrayList<>(outer.get(0));
        System.out.println(ans);
//        outer.add(internal);
//        internal.add(9);
        System.out.println(internal);
        System.out.println(outer);
    }
}
