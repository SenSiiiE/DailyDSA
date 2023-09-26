package com.codingRound;

import java.util.ArrayList;
import java.util.List;

//11) How to find all permutations of String?
public class allPermutations {
    public static void main(String[] args) {
        System.out.println(perm("", "abc"));
    }

    static List<String> list = new ArrayList<>();
    static List<String> perm(String p, String up){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            perm(f + ch + s, up.substring(1));
        }
        return list;
    }
}
