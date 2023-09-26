package com.codingRound;

public class binarySearch {
    public static void main(String[] args) {
        System.out.println(binary(new int[]{2,5,7,11,45}, 45));
    }
    static int binary(int[] a, int target){
        int s = 0;
        int e = a.length - 1;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(a[mid] == target){
                return mid;
            }else if(a[mid] > target){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return -1;
    }
}
