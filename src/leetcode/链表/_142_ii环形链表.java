package leetcode.链表;

/**
 * @ClassName _142_ii环形链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/9 15:53
 */
public class _142_ii环形链表 {
    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if (fast == null || fast.next == null)
            return null;
        slow = head;
        while (slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode detectCycle1(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                //说明有环
                break;
            }
        }
        //没有环直接返回
        if (fast == null || fast.next == null)
            return null;
        //快的置开头,一步一步走,相遇即为入口节点
        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}