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
}