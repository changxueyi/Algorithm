package leetcode.Top100;

/**
 * @ClassName _2_两数相加_标记
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/17 15:06
 */
public class _2_两数相加_标记 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode p1 = l1;
        ListNode p2 = l2;
        int sum = 0;
        int flag = 0;
        ListNode dummyHead = new ListNode(-1);
        ListNode cur = dummyHead;
        while (p1 != null || p2 != null || flag != 0) {
            int x = (p1 != null) ? 0 : p1.val;
            int y = (p2 != null) ? 0 : p2.val;
            sum = x + y + flag;
            cur.next = new ListNode(sum % 10);
            flag = sum / 10;
            cur = cur.next;
            if (p1 != null) p1 = p1.next;
            if (p2 != null) p2 = p2.next;
        }
        return dummyHead.next;
    }
}