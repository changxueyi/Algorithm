package leetcode.链表;

import com.sun.org.apache.xpath.internal.objects.XNull;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @ClassName _25_K个一组翻转链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/7 16:46
 */
public class _25_K个一组翻转链表 {
    //  使用栈来解决，不推荐使用
    public ListNode reverseKGroup(ListNode head, int k) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        while (true) {
            int count = 0;
            ListNode tmp = head;
            while (tmp != null && count < k) {
                stack.add(tmp);
                tmp = tmp.next;
                count++;
            }
            if (count != k) {
                p.next = head;
                break;
            }
            while (!stack.isEmpty()) {
                p.next = stack.pop();
                p = p.next;
            }
            p.next = tmp;
            head = tmp;
        }
        return dummy.next;
    }

    //自己容易懂的方法，自己直接写出来的方法
    //推荐使用
    public static ListNode reverseKGroup1(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode end = dummy;
        while (end != null) {
            //让end遍历到需要反转的最后一个元素位置
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }
            //只要end遍历到了null，直接跳出循环
            if (end == null) {
                break;
            }
            //定义pLast指向反转元素后面的第一个元素;
            ListNode pLast = end.next;
            //定义start 指向反转元素的第一个位置
            ListNode start = pre.next;

            //最后一个反转元素先断链
            end.next = null;
            // 然后通过翻转方法 reverse() 后接在 pre 后面
            pre.next = reverse(start);
            //保持下一次循环一致的位置
            start.next = pLast;//让断开的连上
            pre = start;
            end = pre;
        }
        return dummy.next;
    }

    private static ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode p = cur.next;
            cur.next = pre;
            pre = cur;
            cur = p;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        ListNode a  = reverseKGroup1(node1,3);
        while (a!=null){
            System.out.print(a.val);
            System.out.print("->");
            a = a.next;
        }
    }


}