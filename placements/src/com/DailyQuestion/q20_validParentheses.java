package DailyQuestion;

import java.util.Stack;

public class q20_validParentheses {
    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValid(s));
    }

    private static boolean isValid(String s) {
                Stack<Character> stack = new Stack<>();
                for (int i = 0; i<s.length(); i++) {
                    if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                        stack.push(s.charAt(i));
                    } else {
                        if (stack.empty()) {
                            return false;
                        }
                        if (s.charAt(i) == ')' && stack.peek() == '(') {
                            stack.pop();
                        } else if (s.charAt(i) == '}' && stack.peek() == '{') {
                            stack.pop();
                        } else if (s.charAt(i) == ']' && stack.peek() == '[') {
                            stack.pop();
                        } else {
                            return false;
                        }
                    }
                }
                return stack.empty();
            }
}
