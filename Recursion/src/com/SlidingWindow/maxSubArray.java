package com.SlidingWindow;

public class maxSubArray {
    public static void main(String[] args) {
        int[] arr = {4,7,1,5,3,9};
        int i = 0, j = 0, sum = 0, mx = Integer.MIN_VALUE;
        
        while(j<arr.length ){
            sum = sum + arr[j];
            if(j-i+1 < 3){
                j++;
            }else if(j-i+1 == 3){
                mx = Math.max(sum, mx);
                sum = sum - arr[i];
                j++;
                i++;
//                mx = Math.max(sum, mx);
            }
        }
        System.out.println(mx);
    }
}
