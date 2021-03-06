package leetcode.链表;

import java.util.List;

/**
 * @ClassName _82_删除排序链表中的重复元素_较复杂
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/9 15:00
 */
public class _82_删除排序链表中的重复元素_较复杂 {
    /*public ListNode deleteDuplicates1(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        ListNode cur = new ListNode(0);
        ListNode dummy = cur;
        while (slow != null && fast != null) {
            if (slow.val != fast.val) {
           //     dummy.next = slow;
                fast = fast.next;
                slow = slow.next;
                dummy = dummy.next;
            } else {
                while (slow!=null&&slow.next!=null&&fast.val == slow.val) {
                   // slow.next = slow.next.next;
                    fast = fast.next;
                    slow = slow.next;
                }
               // dummy.next = slow.next.next;
               *//* dummy = dummy.next;
                slow = fast;
                fast = fast.next;*//*
               dummy.next = fast;
               fast  = fast.next;
               slow = slow.next;
            }
        }
        return cur.next;
    }*/
    // 很优秀的方法
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                ListNode temp = cur.next;
                while (temp != null && temp.next != null && temp.val == temp.next.val) {
                    temp = temp.next;
                }
                cur.next = temp.next;
            } else
                cur = cur.next;
        }
        return dummy.next;
    }

    //15点38分 2020/5/9
    public ListNode deleteDuplicates1(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                ListNode temp = cur.next;
                while (temp != null && temp.next != null && temp.val == temp.next.next.val) {
                    temp = temp.next;
                }
                cur.next = temp.next;
            } else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }

    //16点21分 2020 /5/18 再战
    public ListNode deleteDuplicates2(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode pre = dummy;
        while (pre.next != null && pre.next.next != null) {
            if (pre.next.val == pre.next.next.val) {
                ListNode temp = pre.next;
                while (temp != null && temp.next != null && temp.val == temp.next.next.val) {
                    temp = temp.next;
                }
                pre.next = temp.next;
            } else {
                pre = pre.next;
            }
        }
        return dummy.next;
    }

    static void Swap(int a, int b) {
        if (a != b) {
            a ^= b;
            b ^= a;
            a ^= b;
        }
    }

    public static void main(String[] args) {
        int a = 2,b =3;
        Swap(a,b);
        System.out.println(a);
    }

}