package Leetcode.TopK;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @ClassName lc_215_数组中的最大元素
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/4 9:04
 */
public class lc_215_数组中的最大元素 {
    //思路：建立一个大小为K的小顶堆，返回堆顶元素
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (Integer n : nums){
            //其实这里省略了一步，当queue.size<k时候，直接仍进去元素
           /* queue.add(n);
            if (queue.size()>k){
                queue.poll();
            }*/
           if (queue.size()<k){
               queue.add(n);
           }
           else if (n>queue.peek()){
               queue.poll();
               queue.add(n);
           }
        }
        return queue.poll();
    }
}