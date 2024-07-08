package com.Sapient;

import java.util.Arrays;

public class sortAB {
    public static void main(String[] args) {
        System.out.println(sort("ababababbabbabbbba"));
    }
    static String sort(String s){
        char[] str = s.toCharArray();
        int i = 0;
        int j = str.length - 1;

        while(i <= j){
            if(str[i] == 'b' && str[j] == 'a'){
                str[i] = 'a';
                str[j] = 'b';
            }
            if (str[i] == 'a') {
                i++;
            }
            if (str[j] == 'b'){
                j--;
            }
        }
        return Arrays.toString(str);
    }
}
