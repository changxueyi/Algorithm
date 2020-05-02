package Leetcode.链表;

/**
 * @ClassName _22_链表中倒数第k个节点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/2 11:42
 */
public class _22_链表中倒数第k个节点 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

}