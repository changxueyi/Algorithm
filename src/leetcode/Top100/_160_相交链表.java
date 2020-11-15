package leetcode.Top100;

/**
 * @ClassName _160_相交链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/10/20 20:33
 */
public class _160_相交链表 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;
        //为什么可以这样写，因为，头节点a,头节点b,在a=b,之前，他俩走过的路程是一样的
        while (a != b) {
            if (a != null) {
                a = a.next;
            } else {
                a = headB;
            }
            if (b != null) {
                b = b.next;
            } else {
                b = headA;
            }
        }
        return a;
    }
}