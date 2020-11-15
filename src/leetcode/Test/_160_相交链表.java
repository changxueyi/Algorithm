package leetcode.Test;

/**
 * @ClassName _160_相交链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/24 8:51
 */
public class _160_相交链表 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            if (a != null) {
                a = a.next;
            }
            else{
                a = headB;
            }
            if (b != null) {
                b = b.next;
            }
            else  {
                b = headA;
            }
        }
        return a;
    }
}