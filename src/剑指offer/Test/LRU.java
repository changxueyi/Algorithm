package 剑指offer.Test;

import leetcode.其他.LRU_字节跳动;

import java.util.HashMap;

import static javax.swing.UIManager.put;

/**
 * @ClassName LRU
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/9 14:31
 */
public class LRU {
    class Node {
        public int val, key;
        public Node prev, next;

        public Node(int v, int k) {
            this.key = k;
            this.val = v;
        }
    }

    class DoubleList {
        private Node head, tail;
        private int size;

        public DoubleList() {
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.prev = head;
            int size = 0;
        }

        //在链表头部加入一个节点
        public void addFirst(Node x) {
            x.next = head.next;
            x.prev = head.next.prev;
            head.next = x;
            head.next.prev = x;
            size++;
        }

        public Node removeLast() {
            if (tail.prev == head) {
                return null;
            }
            Node last = tail.prev;
            remove(last);
            return last;
        }

        public void remove(Node x) {
            x.prev.next = x.next;
            x.next.prev = x.prev;
            size--;
        }

        // 返回链表长度
        public int size() {
            return size;
        }
    }

    class LRUCache {
        private HashMap<Integer, Node> map;
        private DoubleList cache;
        //最大的容量
        private int cap;

        public LRUCache(int capacity) {
            this.cap = capacity;
            map = new HashMap<>();
            cache = new DoubleList();
        }

        public int get(int key) {
            if (!map.containsKey(key))
                return -1;
            int val = map.get(key).val;
            put(key, val);
            return val;
        }

        //put 操作
        public void put(int key, int value) {
            Node x = new Node(key, value);
            if (map.containsKey(key)) {
                cache.remove(map.get(key));
                cache.addFirst(x);
                map.put(key, x);
            } else {
                if (cap == cache.size) {
                    Node last = cache.removeLast();
                    map.remove(last.key);
                }
                cache.addFirst(x);
                //更新map中的数据
                map.put(key,x);
            }

        }

    }
}