package com.placementCvent;

import java.util.Arrays;

public class sortByLength {
    public static void main(String[] args) {
        String str="God love i";
        String[] a = str.split(" ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if(a[j].length() > a[j+1].length()){
                    String temp = a[j];
                    a[j] = a[j + 1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
