package leetcode.Top100;

/**
 * @ClassName _19_删除链表倒数第N节点__注意空指针
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/17 16:18
 */
public class _19_删除链表倒数第N节点__注意空指针 {
    //下面执行出现空指针异常
    //比如输入：[1] 1,或者 [1,2] 2 就会出问题
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        if (head == null) return head;
        if (head.next == null && n == 1) return null;
        ListNode cur = head;
        ListNode fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            cur = cur.next;
        }
        if (fast.next == null) {
            cur.next = cur.next.next;
        }
        return head;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        ListNode fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            cur = cur.next;
            pre = pre.next;
        }
        if (fast == null) {
            pre.next = pre.next.next;
        }
        return dummy.next;
    }
}