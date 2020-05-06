package 剑指offer.链表;

/**
 * @ClassName _8_删除链表的节点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/2 10:31
 */
public class _8_删除链表的节点 {
    public static ListNode deleteNode(ListNode head, int val) {
        if (head == null) return null;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        while (pre.next != null) {
            if (pre.next.val == val)
                pre.next = pre.next.next;
            else
                pre = pre.next;
        }
        return dummy.next;
    }

    //方法二：不新建虚拟头节点
    public ListNode deleteNode1(ListNode head, int val) {
        if (head.val == val) return head.next;
        ListNode pre = head, cur = head.next;
        while (cur != null && cur.val != val) {
            pre = cur;
            cur = cur.next;
        }
        if (cur != null) pre.next = cur.next;
        return head;
    }

    public ListNode deleteNode2(ListNode head, int val) {
        if (head.val == val) return head.next;
        ListNode pre = head;
        while (pre.next != null && pre.next.val != val) {
            pre = pre.next;
        }
        if (pre.next!=null) pre.next = pre.next.next;
        return head;
    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(2);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNode a = deleteNode(node1, 2);
        while (a != null) {
            System.out.print(a.val);
            System.out.print("->");
            a = a.next;
        }
        //    System.out.println(a);

    }
}