package com.pattern;

public class stringRemove {
    public static void main(String[] args) {
        String s = "abccdaaae";
        System.out.println(remove(s, new StringBuilder(""), 0));
    }
    static String remove(String s, StringBuilder sb, int start){
        if(start == s.length()) return sb.toString();

        if(s.charAt(start) != 'a'){
            sb.append(s.charAt(start));
        }
        return remove(s, sb, start+1);
    }
}
