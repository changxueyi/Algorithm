package leetcode.链表;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @ClassName _2_两数相加_未做出来
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/9 17:31
 */
public class _2_两数相加_未做出来 {
    //未做出来
    /*public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        ListNode node1 = l1;
        while (node1 != null) {
            queue1.add(node1.val);
            node1 = node1.next;
        }
        ListNode node2 = l2;
        while (node2 != null) {
            queue2.add(node2.val);
            node2 = node2.next;
        }
        //创建一个链表空的
        ListNode head = null;
        //初次余数设置为空
        int flag = 0;
        while (queue1.isEmpty() || queue2.isEmpty() || flag != 0) {
            int sum = 0;
            if (queue1 != null) {
                sum += queue1.poll();
            }
            if (queue2 != null) {
                sum += queue2.poll();
            }

            sum += flag;

            ListNode node = new ListNode(sum % 10);
            flag = sum/10;

            head.next = node;
            head = head.next;
        }
        return head;
    }*/
}