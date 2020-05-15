package leetcode.Test;

import jdk.nashorn.internal.ir.CallNode;
import leetcode.其他.LRU_字节跳动;
import sun.misc.LRUCache;

import java.util.HashMap;

/**
 * @ClassName LRUTest
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/11 15:03
 */
public class LRUTest {
    class Node {
        private int key;
        private int val;
        private Node next;
        private Node prev;

        public Node(int k, int val) {
            this.key = k;
            this.val = val;
        }
    }

    class Doublelist {
        private Node head;
        private Node tail;
        private int size;

        public Doublelist() {
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.prev = head;
            int size = 0;
        }

        //添加一个节点在首部               ****************错误一
        public void addFirst(Node x) {
            head.next.prev = x;
            head.next = x;
            size++;
        }

        //删除节点
        public void remove(Node x) {
            //删除节点
            x.prev.next = x.next;
            x.next.prev = x.prev.next; //错误二
            //错误三
            //删除节点
            //更新放在前面
            //put(keyj, CallNode.EvalArgs)
        }

        //删除最后一个节点
        public Node removeLast() {  //错误四
            if (tail.prev == head) {
                return null;
            }
            Node last = tail.prev;
            size--;
            return last;
        }

        //节点中的数量
        public int size() {
            return size;
        }
    }

    public class LRUCache {
        private HashMap<Integer, Node> map;
        private Doublelist cache;
        //最大的容量
        private int cap;

        public LRUCache(int capacity) {
            this.cap = capacity;
            map = new HashMap<>();
            cache = new Doublelist();
        }

        //获取一个元素
        public void get(Node node) {
            //1.如果这个节点不存在情况
            //2.节点存在
            if (node != null) {
                return;
            }
        }

        public void put(int key, int val) {
            Node x = new Node(key, val);
            //如果这个节点不存在的情况下
            if (!map.containsKey(key)) {
                //删除
                cache.remove(map.get(key));
                //新的节点插入到头
                cache.addFirst(x);
                //对照映射关系
                map.put(key, x);
            } else {
                if (cap == cache.size) {
                    Node last = cache.removeLast();
                    map.remove(last.key);
                }
                cache.addFirst(x);
                map.put(key,x);
            }
        }
    }

}