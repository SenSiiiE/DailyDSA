package com.oops;

public class digitSum {
    public static void main(String[] args) {
//        System.out.println((int)Math.log10(1000) + 1);
        int num = 77;
        while((int)Math.log10(num) + 1 != 1){
            num = sum(num);
        }
        System.out.println(num);
//        System.out.println(sum(234));
    }
    static int sum(int num){
        int ans = 0;
        while(num > 0){
            ans += num % 10;
            num /= 10;
        }
        return ans;
    }
}
