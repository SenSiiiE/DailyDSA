package com.codingRound;

import java.util.ArrayList;
import java.util.*;

public class collectionTraversal {
    public static void main(String[] args) {



        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
//        String s = set.toString();
        String s = "";
//        System.out.println(s);?\
        for (Integer integer : set) {
            s += integer;
        }
        System.out.println(s);

        Map<Integer, Integer> map = new TreeMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        map.put(4,4);

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getValue());
        }

        List<Integer> ls= new Vector<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);

        for (Integer l : ls) {
            System.out.println(l);
        }
    }
}
