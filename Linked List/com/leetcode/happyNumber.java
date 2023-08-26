package com.leetcode;

import java.util.Arrays;

public class happyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        Arrays.sort(arr);
    }
    public static boolean isHappy(int n){
        int s = n;
        int f = n;

        do {
            s = squareDigitSum(s);
            f = squareDigitSum(squareDigitSum(f));
        } while(s != f);
        if(s == 1) return true;
        return false;
    }

    static int squareDigitSum(int num){
        int rem = 0;
        int ans = 0;
        while(num > 0){
            rem = num % 10;
            ans = ans + rem*rem;
            num = num / 10;
        }
        return ans;
    }
}
