package com.Array;

import java.util.Arrays;

public class SortSentence {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(String s1 : word1){
            sb1.append(s1);
        }

        for(String s2 : word2){
            sb2.append(s2);
        }

        return sb1.compareTo(sb2) == 0;
    }
    public static String sortSentence(String s) {
        String[] str = s.split(" ");

        for(int i = 0; i < str.length; i++){
            String current = str[i];
            int j = i - 1;
            while(j >= 0 && (int)str[j].charAt(str[j].length() - 1) > (int)str[i].charAt(str[i].length() - 1)){
                str[j + 1] = str[j];
                j--;
            }
            str[j + 1] = current;
        }
//        StringBuffer sb = new StringBuffer();
//        for(int i = 0; i < str.length; i++){
//            sb.append(str[i]);
//            sb.replace(str[i].length() - 1, str[i].length(), " ");
//        }
        return Arrays.toString(str);
    }
}
