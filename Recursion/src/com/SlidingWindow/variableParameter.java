package com.SlidingWindow;

import java.util.Arrays;
import java.util.Hashtable;

public class variableParameter {
    public static void main(String[] args) {
        none(1,2,3,4,5,6,7);
    }
    public static void none(int...a){
        int[] b = a;
        System.out.println(Arrays.toString(b));

    }

}
