package leetcode.Test;


/**
 * @ClassName LRUTest02
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/14 15:43
 */
public class LRUTest02 {
    //再战LRU
    class Node {
        Node next;
        Node prev;
        int val;
        int key;

        public Node(int k, int v) {
            this.key = k;
            this.val = v;
        }
    }

    class DoubleList {
        Node head;
        Node tail;
        private int size;

        public DoubleList() {
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.prev = head;
            int size=0;
        }
    }

}