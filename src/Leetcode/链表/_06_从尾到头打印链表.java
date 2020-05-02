package Leetcode.链表;

import java.util.Stack;

/**
 * @ClassName _06_从尾到头打印链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/2 9:10
 */
public class _06_从尾到头打印链表 {
    public static int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int arr[] = new int[stack.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        return arr;
    }


}