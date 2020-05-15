package leetcode.链表;


import java.util.Stack;

/**
 * @ClassName _445_两数相加
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/13 14:14
 */
public class _445_两数相加 {
    // 7  2  4  3
    //  0  5  6  4
    //  7  8  0  7
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 定义两个栈存储两个链表的元素
        Stack<Integer> stack1 = new Stack();
        Stack<Integer> stack2 = new Stack();

        // 定义 node1 指针遍历 l1 链表元素入栈
        ListNode node1 = l1;
        while (node1 != null) {
            stack1.push(node1.val);
            node1 = node1.next;
        }

        // 定义 node2 指针遍历 l2 链表元素入栈
        ListNode node2 = l2;
        while (node2 != null) {
            stack2.push(node2.val);
            node2 = node2.next;
        }
        //创建新链表头节点 head，头插法的灵魂
        ListNode head = null;
        //定义进位标志0/1
        int flag = 0;
        while (!stack1.isEmpty() || !stack2.isEmpty() || flag != 0) {
            //定义累加和
            int sum = 0;
            if (!stack1.isEmpty()) {
                sum += stack1.pop();
            }
            if (!stack2.isEmpty()) {
                sum += stack2.pop();
            }
            // 如果有进位则加上进位值 0 / 1
            sum += flag;
            // 创建 node 指向累加和计算出来的元素
            ListNode node = new ListNode(sum % 10);
            //求出进位值0/1
            flag = sum / 10;
            node.next = head;
            head = node;
        }
        return head;
    }

    //对应第2题的解法
    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        ListNode node1 = l1;
        while (node1 != null) {
            stack1.push(node1.val);
            node1 = node1.next;
        }
        ListNode node2 = l2;
        while (node2 != null) {
            stack2.push(node2.val);
            node2 = node2.next;
        }
        //头插法，创建新链表头节点 head，头插法的灵魂
        ListNode head = null;
        int carry = 0;
        //1.不能这样写，这样写，爆堆栈溢出
       // while (stack1 != null || stack2 != null || carry != 0) {
        //                                          或者carry > 0
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {
            //2.这样写，爆堆栈溢出
            /*int x = (stack1 != null) ? stack1.pop() : 0;
            int y = (stack2 != null) ? stack2.pop() : 0;*/
            int x = stack1.isEmpty() ? 0: stack1.pop();
            int y = stack2.isEmpty() ?  0: stack2.pop();
            int sum = x + y + carry;
            // *********链表头插法 注意前面链头定义为null******
            ListNode node = new ListNode(sum % 10);
            //头插法
            carry = sum / 10;
            //由于node是临时变量，不能返回，我们用head代替temp，作为链表头
            node.next = head;
            //此时，依然是高位在前，低位在后。头节点进行移动
            head = node;
        }
        return head;
    }
}