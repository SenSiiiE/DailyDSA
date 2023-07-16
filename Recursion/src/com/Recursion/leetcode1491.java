package com.Recursion;

public class leetcode1491 {
    public static void main(String[] args) {
        int[] salary = {1000,2000,3000};
        System.out.println(average(salary));
    }
    public static double average(int[] salary) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0; i<salary.length; i++){
            sum = sum + salary[i];
            if(salary[i]>max) max = salary[i];
            if(salary[i]<min) min = salary[i];
        }
        return (double)(sum - max - min)/(salary.length-2);
    }
}
