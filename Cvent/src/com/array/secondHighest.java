package com.array;

public class secondHighest {
    public static void main(String[] args) {
        int[] a = {4,1,3,6,11,9,8};
        System.out.println(secondHigh(a));
    }

    static int secondHigh(int[] a){
        int mx = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int num: a) {
            if(num > mx){
                smax = mx;
                mx = num;
            } else if (smax < num && mx > num) {
                smax = num;
            }
        }
        return smax;
    }
}
