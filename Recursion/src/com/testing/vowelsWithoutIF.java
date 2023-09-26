package com.testing;

import java.util.ArrayList;

public class vowelsWithoutIF {
    public static void main(String[] args) {
        String str = "apple is very good";
        System.out.println(isVowel(str));
    }

    private static ArrayList<Character> isVowel(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            switch (str.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    list.add(str.charAt(i));

            }
        }
        return list;
    }
}
