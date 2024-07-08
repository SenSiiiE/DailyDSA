package com.Sapient;

public class distinctAbs {
    public static void main(String[] args) {
        int[] a = {-5,-5,-5,-4,-4,-3,-1,-1};
        System.out.println(distinct(a));
    }
    static int distinct(int[] a){
        int prev = Integer.MIN_VALUE;
        int next = Integer.MAX_VALUE;

        int i = 0;
        int j = a.length - 1;
        int count = 0;
        while(i <= j){
            if(Math.abs(a[i]) == Math.abs(a[j])){
                if(prev != a[i] && next != a[j]){
                    count++;
                }
                prev = a[i];
                next = a[j];
                i++;
                j--;
            }else if(Math.abs(a[i]) > Math.abs(a[j])){
                if(prev != a[i]){
                    count++;
                }
                prev = a[i];
                i++;
            } else {
                if(next != a[j]){
                    count++;
                }
                next = a[j];
                j--;
            }
        }
        return count;
    }
}
