package leetcode.Top100;

/**
 * @ClassName _234_回文链表0
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/10/21 15:17
 */
public class _234_回文链表0 {
    //回文链表
    //判断一个链表是否是回文链表
    public boolean isPalindrome(ListNode head) {
        //输入 1 -> false;
        if (head == null) return true;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        return true;
    }



}