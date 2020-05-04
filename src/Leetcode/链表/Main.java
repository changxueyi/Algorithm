package Leetcode.链表;

import java.util.Arrays;

import static Leetcode.链表._06_从尾到头打印链表.reversePrint;
import static Leetcode.链表._24_两两交换链表中的节点.swapPairs;

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
        ListNode a = swapPairs(node1);
        while (a!=null){
            System.out.print(a.val);
            System.out.print("->");
            a = a.next;
        }
    }
}