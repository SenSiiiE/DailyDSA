package com.Strings;

import java.util.ArrayList;

public class DiceCombinations {
    public static void main(String[] args) {
        System.out.println(diceReturn("", 4));
    }

    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i<=target ; i++) {
            dice(p + i, target- i);
        }
    }

    static ArrayList<String> diceReturn(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> down = new ArrayList<>();
        for (int i = 1; i <= 6 && i<=target ; i++) {
            down.addAll(diceReturn(p + i, target- i));
        }
        return down;
    }
}
