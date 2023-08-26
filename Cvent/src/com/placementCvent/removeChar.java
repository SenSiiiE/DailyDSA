package com.placementCvent;

import java.util.Scanner;

public class removeChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "My name is Vikash";
        System.out.println(str);

        System.out.println("Enter the character you want to remove: ");
        char ch = sc.next().charAt(0);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ch){
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
