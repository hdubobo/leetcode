package algorithm;

import java.util.Stack;

public class LC150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; ++i) {
            switch (tokens[i]) {
                case "+":
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(a + b);
                    break;
                case "-":
                    int c = stack.pop();
                    int d = stack.pop();
                    stack.push(d - c);
                    break;
                case "*":
                    int e = stack.pop();
                    int f = stack.pop();
                    stack.push(e * f);
                    break;
                case "/":
                    int g = stack.pop();
                    int h = stack.pop();
                    stack.push(h / g);
                    break;
                default:
                    stack.push(Integer.parseInt(tokens[i]));
                    break;
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {
        LC150 lc = new LC150();
        String[] tokens = new String[]{"2", "1", "+", "3", "*"};
        System.out.println(lc.evalRPN(tokens));
    }
}
