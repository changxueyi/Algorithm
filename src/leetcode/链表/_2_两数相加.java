package leetcode.链表;

import java.util.Stack;

/**
 * @ClassName _2_两数相加_标记
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/14 21:16
 */
public class _2_两数相加 {
    //这个题，我不知道为啥，自己走不通
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        ListNode node1 = l1;
        while (node1 != null) {
            stack1.push(node1.val);
            node1 = node1.next;
        }
        ListNode node2 = l2;
        while (node2 != null) {
            stack2.push(node2.val);
            node2 = node2.next;
        }
        ListNode head = null;
        int flag = 0;
        while (!stack1.isEmpty() || !stack2.isEmpty() || flag != 0) {
            int sum = 0;
            if (!stack1.isEmpty()) {
                sum += stack1.pop();
            }
            if (!stack2.isEmpty()) {
                sum += stack2.pop();
            }
            sum += flag;
            ListNode node = new ListNode(sum % 10);
            flag = sum / 10;
            node.next = head;
            head = node;
        }
         return   reverse(head);
    }

    private ListNode reverse(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    //正确答案的版本
    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode dummyHead = new ListNode(-1);
        ListNode cur = dummyHead;
        //进位数
        int carry = 0;
        //                               或者carry > 0
        while (p1 != null || p2 != null||carry!=0) {
            int x = (p1 != null) ? p1.val : 0;
            int y = (p2 != null) ? p2.val : 0;
            int sum = carry + x + y;
            cur.next = new ListNode(sum % 10);
            carry = sum / 10;
            cur = cur.next;
            if (p1 != null) p1 = p1.next;
            if (p2 != null) p2 = p2.next;
        }
        //最后各位上面如果还有进位的话，继续进位//或者再上面进行判断carry!=0也可以
        /*if (carry > 0) {
            cur.next = new ListNode(carry);
        }*/
        return dummyHead.next;
    }
}