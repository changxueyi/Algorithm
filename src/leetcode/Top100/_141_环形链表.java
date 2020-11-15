package leetcode.Top100;

/**
 * @ClassName _141_环形链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/10/21 14:53
 */
public class _141_环形链表 {
    //环形链表,如果链表存在环，返回true,否则，返回false
    public boolean hasCycle(ListNode head) {
        //快慢指针解决
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            //快慢指针每次走一步
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    //判断链表是否有环
    public boolean fun(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            //快慢指针每次走一步
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}