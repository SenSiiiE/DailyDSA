package com.codingRound;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class newtest {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,2);
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
