package leetcode.Test;

import java.util.Stack;

/**
 * @ClassName _445_两数相加II
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/23 10:34
 */
public class _445_两数相加II {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a = l1;
        ListNode b = l2;
        ListNode head = null;
        int sum = 0;
        int flag = 0;
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while (a != null) {
            stack1.push(a.val);
            a = a.next;
        }
        while (b != null) {
            stack2.push(b.val);
            b = b.next;
        }
        //万万不可用stack1 ！= null 这样判断，栈队列用 isEmpty
        while (!stack1.isEmpty() || !stack2.isEmpty() || flag != 0) {
            int x = stack1.isEmpty() ? 0 : stack1.pop();
            int y = stack2.isEmpty() ? 0 : stack2.pop();
            sum = x + y + flag;
            ListNode node = new ListNode(sum % 10);
            flag = sum / 10;
            node.next = head;
            head = node;
        }
        return head;
    }
}