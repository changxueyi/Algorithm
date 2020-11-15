package leetcode.Test;

import java.util.List;

/**
 * @ClassName __合并两个排序链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/11/8 11:20
 */

public class __合并两个排序链表 {
    public static ListNode fun(ListNode list1, ListNode list2) {
        ListNode a = list1;
        ListNode b = list2;
        ListNode newList = new ListNode(-1);
        ListNode c = newList;
        while (a != null && b != null) {
            if (a.val > b.val) {
                c.next = b;
                b = b.next;
            } else {
                c.next = a;
                a = a.next;
            }
            c = c.next;
        }
        if (a == null) {
            c.next = b;
        } else {
            c.next = a;
        }
        return newList.next;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(0);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(5);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(9);
        ListNode a6 = new ListNode(11);
        a1.next = a3;
        a3.next = a5;//1,5,9
        a2.next = a4;
        a4.next = a6;//2,4,11
        ListNode currNode = fun(a1, a2);
        while (currNode.next != null) {
            System.out.print(currNode.val);
            System.out.print("->");
            currNode = currNode.next;
        }
    }
}