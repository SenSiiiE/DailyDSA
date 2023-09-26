package com.codingRound;

import java.util.Arrays;

public class grocerySale {
    public static void main(String[] args) {
        int [] a = {1,1,1,1,1,2,2,2};
        System.out.println(sale(a, a.length));
    }
    static int sale(int[] a, int n){
        int result = -404;
        if(n == 0) return result;
        else if(n < 4) {
            result = 0;
            for (int i = 0; i < n; i++) {
                result += a[i];
            }
            return result;
        }
        result = 0;
        int i = 0;  
        Arrays.sort(a);
        if (n % 4 == 1) i = 1;
        else if (n % 4 == 2) i = 2;
        else if (n % 4 == 3) i = 3;

        for (int j = 0; j < n; j++) {
            if(i == j){
                i = i + 4;
            }else {
                result += a[j];
            }
        }
        return result;
    }
}
