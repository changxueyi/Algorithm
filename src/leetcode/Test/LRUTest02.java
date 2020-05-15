package leetcode.Test;

import sun.misc.LRUCache;
import 剑指offer.Test.LRU;

import java.util.HashMap;

/**
 * @ClassName LRUTest02
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/14 15:43
 */
public class LRUTest02 {
    //再战LRU
    class Node {
        private Node prev, next;
        private int val;
        private int key;

        public Node(int x, int k) {
            val = x;
            key = k;
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
            size = 0;
        }

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

        public int size() {
            return size;
        }
    }

    public class LRUCache {
        private HashMap<Integer, Node> map;
        private DoubleList cache;
        private int cap;

        public LRUCache(int ca) {
            map = new HashMap<>();
            cache = new DoubleList();
            cap = ca;
        }

        public int get(int key) {
            if (!map.containsKey(key)) {
                return -1;
            }
            int a = map.get(key).val;
            put(key, a);
            return a;
        }

        public void put(int key, int value) {
            Node node = new Node(key, value);
            if (map.containsKey(key)) {
                map.remove(key);
                cache.addFirst(node);
                //更新map
                map.put(key, node);
            } else {
                if (cap == cache.size) {
                    Node last = cache.removeLast();
                    map.put(key,last);
                }
                cache.addFirst(node);
                map.put(key,node);
            }
        }
    }

}