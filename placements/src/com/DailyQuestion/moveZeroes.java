package com_placement;

import java.util.Arrays;

public class moveZeroes {
    public static void main(String[] args) {
        int [] nums = {0,1,3,0,12};
        move(nums);
    }

    private static void move(int[] nums) {
        // By insertion sort with O(n)
        for(int i = 1; i<nums.length; i++){
            int current = nums[i];
            int j=i-1;
            while (j>=0 && nums[j]==0){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = current;
        }
        System.out.println(Arrays.toString(nums));


//        for(int i = 0; i<nums.length-1; i++){
//            for(int j = 0; j<nums.length-i-1; j++){
//                if(nums[j]==0){
//                    int temp = nums[j];
//                    nums[j] = nums[j+1];
//                    nums[j+1] = temp;
//                }
//            }
//        }
//        int temp = -100;
//        for (int i = 0; i<nums.length-1; i++){
//            int z = i;
//            for(int j = i+1; j< nums.length; j++){
//                if(nums[z]!=0){
//                    break;
//                }else{
//                    z = j;
//                }
//            }
//            temp = nums[z];
//            nums[z] = nums[i];
//            nums[i] = temp;
//        }
//
//        System.out.println(Arrays.toString(nums));
    }
}
