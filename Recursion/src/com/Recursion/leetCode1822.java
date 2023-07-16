package com.Recursion;

public class leetCode1822 {
    public static void main(String[] args) {
        int[] arr = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        System.out.println(arraySign(arr));
    }
    public static int arraySign(int[] nums) {
        int prod = 1;
        for(int i = 0; i<nums.length; i++){
            prod = prod*nums[i];
            prod = signFunc(prod);
        }
        return signFunc(prod);
    }
    public static int signFunc(int x){
        if(x<0) return -1;
        else if(x>0) return 1;
        else return 0;
    }

}
