package 剑指offer.链表;

/**
 * @ClassName lc_82_删除排序链表重复元素__标记
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/2 11:18
 */
public class lc_82_删除排序链表重复元素__标记 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = head;
        while (dummy.next != null) {
            if (dummy.next.val == dummy.next.next.val) {
                return null;
            }
        }
        return null;
    }

    public ListNode deleteDuplicates1(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = head;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                ListNode temp = cur.next;
                while (temp != null && cur.next != null && temp.val == temp.next.val) {
                    temp = temp.next;
                }
                cur.next = temp.next;
            } else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }

}