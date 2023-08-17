package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class leet443 {
    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a','a','a','b','b','a','a'}));
    }


        public static int compress(char[] chars) {
            int n = chars.length;
            if (n == 0) return 0;

            int write = 0;
            int count = 1;
            char current = chars[0];

            for (int i = 1; i < n; i++) {
                if (chars[i] == current) {
                    count++;
                } else {
                    chars[write++] = current;
                    if (count > 1) {
                        for (char c : Integer.toString(count).toCharArray()) {
                            chars[write++] = c;
                        }
                    }
                    current = chars[i];
                    count = 1;
                }
            }

            // Add the last character and its count (if count > 1)
            chars[write++] = current;
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
            System.out.println(Arrays.toString(chars));
            return write;
        }


}
