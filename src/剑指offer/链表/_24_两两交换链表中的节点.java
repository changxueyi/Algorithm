package 剑指offer.链表;

/**
 * @ClassName _24_两两交换链表中的节点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/3 10:12
 */
public class _24_两两交换链表中的节点 {
    //写链表代码的时候，指针指来指去，很容易就把指针丢失，造成链表断裂。
    // 所以在操作链表时，其操作顺序就是我们着重关注的点。
    public static ListNode swapPairs(ListNode head) {
        if (head == null) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        //保证两个都不能为空
        while (pre.next != null && pre.next.next != null) {
            ListNode start = pre.next;
            ListNode end = pre.next.next;
            pre.next = end;
            start.next = end.next;
            end.next = start;

            pre = start;
        }
        return dummy.next;
    }
}