package leetcode.Test;

import java.util.ArrayList;

/**
 * @ClassName _234_回文链表0
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/24 9:01
 */
public class _234_回文链表 {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        while (head != null) {
            arr.add(head.val);
            head = head.next;
        }
        int i = 0, j = arr.size() - 1;
        //以后注意了这个位置双指针，尽量少些！=
        while (i <= j) {
            int x = arr.get(i++);
            int y = arr.get(j--);
            /*if (x == y) {
                continue;
            } else {
                return false;
            }*/
            if (x != y) {
                return false;
            }

        }
        return true;
    }


    public boolean isPalindrome1(ListNode head) {
        if (head == null) return true;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode a = dummy;
        ListNode fast = dummy;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            pre = pre.next;
        }
        ListNode cur = pre.next;
        pre.next = null;
        ListNode node = reverse(cur);
        while (node != null) {
            if (a.next.val != node.val) {
                return false;
            } else {
                node = node.next;
                a = a.next;
            }
        }
        return true;
    }

    private ListNode reverse(ListNode node) {
        ListNode pre = null;
        ListNode cur = node;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}