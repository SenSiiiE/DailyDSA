package com.Strings;

import java.util.ArrayList;
public class subsetString {
    public static void main(String[] args) {
        subSeq("abc", "");
        System.out.println(ls);
        System.out.println(subSeqReturn("abc", ""));
    }
    static ArrayList<String> ls = new ArrayList<>();
    static void subSeq(String str, String p){
        if(str.isEmpty()){
            if(!p.equals("")) {
                ls.add(p);
            }
            return;
        }

//        char ch = str.charAt(0);
        subSeq(str.substring(1), p+str.charAt(0));
        subSeq(str.substring(1), p);
    }

    static ArrayList<String> subSeqReturn(String str, String p){
        if(str.isEmpty()){
            ArrayList<String> list1 = new ArrayList<>();
            if(!p.equals("")){
                list1.add(p);
            }
            return list1;
        }

        ArrayList<String> left = subSeqReturn(str.substring(1), p+str.charAt(0));
        ArrayList<String> right = subSeqReturn(str.substring(1), p);

        left.addAll(right);
        return left;

    }
}
