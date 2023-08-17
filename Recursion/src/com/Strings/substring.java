package com.Strings;

public class substring {
    public static void main(String[] args) {
        String up = "abbbccdadaa";
//        skip("", up);
        System.out.println(skipReturn(up));
        System.out.println(skipVikash("abchsVikashmcns"));
    }

    public static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            skip(p, up.substring(1));
        }else{
            skip(p+ch, up.substring(1));
        }
    }
    static String skipReturn(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return skipReturn(up.substring(1));
        }else{
            return ch + skipReturn(up.substring(1));
        }
    }

    static String skipVikash(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("Vikash")){
            return skipVikash(up.substring(6));
        }else{
            return up.charAt(0) + skipVikash(up.substring(1));
        }
    }
}
