package 剑指offer.链表;

/**
 * @ClassName _19_删除链表倒数第N节点__注意空指针
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/2 11:31
 */
public class _19_删除链表的倒数第N个节点 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            pre = pre.next;
        }
        if (fast == null) {
            pre.next = pre.next.next;
        }
        return dummy.next;
    }

    //不建立节点方法
    //14点30分 2020/5/16
    public static ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode pre = head;
        ListNode fast = head;
        for (int i = 0;i<n;i++){
            fast = fast.next;
        }
        while (fast != null && fast.next != null) {
            fast = fast.next;
            pre = pre.next;
        }
        if (fast.next==null){
            pre.next = pre.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode a = removeNthFromEnd1(node1,2);
        while (a!=null){
            System.out.print(a.val);
            System.out.print("->");
            a = a.next;
        }
    }
}