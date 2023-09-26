package com.codingRound;

public class findMissing {
    public static void main(String[] args) {
        System.out.println(missing(new int[]{1,2,4,5}));
    }
    static int missing(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        int sum2 = (a.length + 1) * (a.length + 2)/2;

        return sum2 - sum;
    }
}
