package com.Recursion;
import java.util.Stack;
public class leet2696 {
    public static void main(String[] args) {
        System.out.println(minLength("ABFCACDB"));
    }
        public static int minLength(String s) {
            Stack<Character> stack = new Stack<>();

            StringBuilder sb = new StringBuilder(s);
            int len = sb.length();
            
            for(int i = 0; i<len; i++){
                char ch1 = sb.charAt(i);
                if(ch1=='B' && stack.peek()=='A'){
                    stack.pop();
                }else if(ch1=='D' && stack.peek()=='C'){
                    stack.pop();
                }else{
                    stack.push(ch1);
                }
            }
            int i = 0;
            while(!stack.isEmpty()){
                sb.append(stack.pop());
                i++;
            }
            return sb.length();
        }
    }

