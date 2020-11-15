package leetcode.Top100;

import java.util.Stack;

/**
 * @ClassName _20_有效的括号
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/10/21 15:47
 */
public class _20_有效的括号 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                //此刻只剩下右字符
                if (stack.isEmpty()) return false;
                char left = stack.pop();
                if (left == '(' && c != ')') return false;
                if (left == '[' && c != ']') return false;
                if (left == '{' && c != '}') return false;
            }
        }
        return stack.isEmpty();
    }

    //判断括号是否有效这样子
    public boolean isValid1(String s) {
        Stack<Character> stack = new Stack<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char left = stack.pop();
                if (left == '(' && c != ')') return false;
                if (left == '[' && c != ']') return false;
                if (left == '{' && c != '}') return false;
            }
        }
        return stack.isEmpty();
    }

    //判断括号是否是有效的
    public boolean fun1(String s) {
        Stack<Character> stack = new Stack<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c=='('||c=='['||c=='{'){
                stack.push(c);
            }else {
                if (stack.isEmpty()) return false;
                char left  = stack.pop();
                if (left=='('&&c!=')') return false;
                if (left=='['&&c!=']') return false;
                if (left=='{'&&c!='}') return false;
            }
        }
        return stack.isEmpty();
    }
}