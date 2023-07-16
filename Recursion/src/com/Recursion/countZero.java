package com.Recursion;

public class countZero {
    public static void main(String[] args) {
//        System.out.println(count(304020, 0));
    printNos(64);
    }

    public static int count(int n, int count){
        if(n==0) {
//            System.out.println(count);
            return count;
        }
        if(n%10 == 0) count++;

        return count(n/10, count);

    }

    public static void printNos(int N)
    {
        if(N==0) return;

        printNos(N-1);
        System.out.println(N);
    }
}
