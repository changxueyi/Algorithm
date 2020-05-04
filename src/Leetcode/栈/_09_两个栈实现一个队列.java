package Leetcode.栈;

import java.util.Stack;

/**
 * @ClassName _09_两个栈实现一个队列
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/4 17:13
 */
public class _09_两个栈实现一个队列 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()){
            return -1;
        }
        return stack2.pop();
    }

}