package com.Strings;

import java.util.ArrayList;
import java.util.List;

public class permutations {
    public static void main(String[] args) {
       perm("", "abc");
    }

    static void perm(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
                return;
        }

        char ch = up.charAt(0);

        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            perm(f + ch + s, up.substring(1));
        }
    }

    static ArrayList<String> list = new ArrayList<>();
    static List<String> permReturn(String p, String up){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permReturn(f + ch + s, up.substring(1));
        }
        return list;
    }

    static int permCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count = count + permCount(f + ch + s, up.substring(1));
        }
        return count;
    }
}
