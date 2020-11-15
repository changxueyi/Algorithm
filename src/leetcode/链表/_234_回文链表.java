package leetcode.链表;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @ClassName _234_回文链表0
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/6 16:54
 */
public class _234_回文链表 {
    public static boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        while (head != null) {
            arr.add(head.val);
            head = head.next;
        }
        int start = 0;
        int end = arr.size() - 1;
        while (start <= end) {
            int a = arr.get(start);
            int b = arr.get(end);
            if (a != b) {
                return false;
            }
            start += 1;
            end -= 1;
        }
        return true;
    }

    //16点49分 再战
    //无语了，[-129,-129]输入这个，我输出false 预期结果是true
    public boolean isPalindrome1(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        while (head != null) {
            arr.add(head.val);
            head = head.next;
        }
        int n = arr.size();
        for (int i = 0; i < n / 2; i++) {
            if (arr.get(i) != arr.get(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    //1 1 2 1
    //1 2 1 1
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        Boolean a = isPalindrome(node1);

        System.out.println(a);
    }
}