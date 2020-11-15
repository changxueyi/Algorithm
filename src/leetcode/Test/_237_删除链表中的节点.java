package leetcode.Test;

/**
 * @ClassName _237_删除链表中的节点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/24 9:15
 */
public class _237_删除链表中的节点 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}