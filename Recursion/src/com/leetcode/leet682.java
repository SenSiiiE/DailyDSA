package com.leetcode;

import java.util.Stack;

public class leet682 {
    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"5","2","C","D","+"}));
    }

    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String s: operations){
            if(s != "C" && s != "D" && s != "+"){
                stack.push(Integer.parseInt(s));
            }else if(s.equals("C")){
                stack.pop();
            }else if(s.equals("D")){
                stack.push(2 * stack.peek());
            }else if(s.equals("+")){
                int temp1 = stack.pop();
                int temp2 = stack.peek();
                stack.push(temp1);
                stack.push(temp1 + temp2);
            }
        }
        int temp = 0;
        while (!stack.isEmpty()) {
            temp += stack.pop();
        }
        return temp;
    }
}
