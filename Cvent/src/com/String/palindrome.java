package com.String;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(palindromeCheck("abcb"));
    }
    static boolean palindromeCheck(String s){
        int n = s.length();
        for(int i = 0; i < n / 2; i++){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(n - i - 1);
            if(ch1 != ch2) return false;
        }
        return true;
    }
}
