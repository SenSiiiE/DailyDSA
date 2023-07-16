package com.Recursion;

public class rotatedBS {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        System.out.println(binarySearch(arr,0, 0, arr.length-1));
    }

    static int binarySearch(int[] arr, int target,  int start, int end){
        if(start>end) return -1;
        else{
            int mid = (start + end) / 2;
            if(arr[mid] == target) return mid;


            if (arr[start] <= arr[mid]) {
                if (target >= arr[start] && target <= arr[mid]) {
                    return binarySearch(arr, target, start, mid - 1);
                }else{
                    return binarySearch(arr, target, mid+1, end);
                }
            }

            if (target >= arr[mid] && target <= arr[end]) {
                    return binarySearch(arr, target, mid + 1, end);
            }
            return binarySearch(arr, target, start, mid-1);

            }
        }
    }

