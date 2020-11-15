package leetcode.Test;

import static leetcode.Test._25__K个一组翻转链表.reverseKGroup;

/**
 * @ClassName Main
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/2 9:27
 */
public class Main {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode a = reverseKGroup(node1,3);
        while (a!=null){
            System.out.print(a.val);
            System.out.print("->");
            a = a.next;
        }
    }
}