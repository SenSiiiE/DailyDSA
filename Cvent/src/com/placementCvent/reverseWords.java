package com.placementCvent;

import java.util.ArrayList;

public class reverseWords {
    public static void main(String[] args) {
        System.out.println(reverse("My name is Vikash"));
        reverse2();
    }
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder("");
        String[] arr = s.split(" ");
        for(int i = arr.length - 1; i >= 0; i--){
            String str = arr[i];
            sb.append(str);
            sb.append(" ");
        }
        return sb.toString();
    }
    public static void reverse2(){
        String str="I love travelling";
        String arr[]=str.split(" ",str.length());
        ArrayList<String> list=new ArrayList<String>();
        for(int i=arr.length-1;i>=0;i--){

            list.add(arr[i]);
        }
        String strnew=String.valueOf(list);
        //String strnew=
        System.out.println(strnew);
    }
}
