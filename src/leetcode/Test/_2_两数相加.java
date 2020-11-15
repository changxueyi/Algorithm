package leetcode.Test;

/**
 * @ClassName _2_两数相加
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/23 10:24
 */
public class _2_两数相加 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //此处判断不判断都可以
        ListNode dummy = new ListNode(-1);
        ListNode pre = dummy;
        ListNode a = l1;
        ListNode b = l2;
        int sum = 0;
        int flag = 0;
        while (a != null || b != null || flag != 0) {
            int x = (a != null) ? a.val : 0;
            int y = (b != null) ? b.val : 0;
            sum = x + y + flag;
            pre.next = new ListNode(sum % 10);
            flag = sum / 10;
            pre = pre.next;
            if (a!=null) a = a.next;
            if (b!=null) b = b.next;
        }
        return dummy.next;
    }
}