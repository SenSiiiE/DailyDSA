package com.leetcode;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        for(int i = 1; i < 1000; i++){
            if(isHappy(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isHappy(int n){
        int s = n;
        int f = n;

        do {
            s = squareDigitSum(s);
            f = squareDigitSum(squareDigitSum(f));
        } while(s != f);
        return s == 1;
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

