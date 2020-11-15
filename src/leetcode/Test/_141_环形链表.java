package leetcode.Test;

/**
 * @ClassName _141_环形链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/24 8:34
 */
public class _141_环形链表 {
    public boolean hasCycle(ListNode head) {
        ListNode cur = head;
        ListNode fast = head;
        //发现一个神奇的事情，这个位置不可以 更换fast !=null 和 fast.next!=null 的位置
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            cur = cur.next;
            if (fast==cur) {
                return true;
            }
        }
        return false;
    }
}