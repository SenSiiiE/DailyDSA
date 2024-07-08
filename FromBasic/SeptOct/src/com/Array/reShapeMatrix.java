package com.Array;

import java.util.Arrays;

public class reShapeMatrix {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        a = new int[4];
        String s =  "is2 sentence4 This1 a3";
        String[] ans = s.split(" ");
        String n = Arrays.toString(ans);
        System.out.println(n);
        System.out.println(Arrays.toString(s.split(" ")));
        System.out.println(Arrays.toString(a));
    }

}
