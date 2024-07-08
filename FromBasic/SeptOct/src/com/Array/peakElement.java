package com.Array;

public class peakElement {
    public static void main(String[] args) {
        System.out.println(peak(new int[]{1,2,2,2,5,6,6}));
    }
    static int peak(int[] a){
        int s = 0, e = a.length - 1;
        int mid = 0;
        while(s <= e){
            mid = s + (e - s) / 2;
            if((mid == 0 || a[mid] > a[mid - 1]) && (mid == a.length - 1 || a[mid] > a[mid + 1])){
                return mid;
            }
            if(mid > 0 && a[mid - 1] > a[mid]){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return -1;
    }
}
