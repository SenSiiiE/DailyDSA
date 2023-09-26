package com.oops;

public class print {
    public static void main(String[] args) {

        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i);
            }
            System.out.print(" ");
        }
        System.out.println();
        pattern1(new int[]{5, 2, -3, 4, 1});
    }
    static void pattern1(int[] a){
        for(int i = 0; i < a.length; i++){
            if(a[i] >= 0){
                for (int j = 1; j <= 2 ; j++) {
                    System.out.print("_");
                }
                for (int j = 1; j <= a[i] ; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }else{
                for (int j = 1; j <= 3 + a[i] ; j++) {
                    System.out.print("_");
                }
                for (int j = 1; j <= -a[i]; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
