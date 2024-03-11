package algorithm;

import java.util.Stack;

public class LC20 {
    public boolean isValid(String s) {
        int len = s.length();
        if (len % 2 == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(':
                    stack.push(')');
                    break;
                case '{':
                    stack.push('}');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case ')':
                case ']':
                case '}':
                    if (stack.isEmpty() || stack.pop() != c) {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        LC20 lc = new LC20();
        System.out.println(lc.isValid("({{)"));
    }
}
