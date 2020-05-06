package 剑指offer.TopK;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @ClassName _40_最小的K个数
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/4 9:08
 */
public class _40_最小的K个数 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        Queue<Integer> queue = new PriorityQueue<>((v1, v2) -> v2 - v1);
        for (Integer a : arr) {
           /* if (queue.size() < k) {
                queue.add(a);
            } else if (a < queue.peek()) {
                queue.poll();
                queue.add(a);
            }*/
            //这样处理更为简单、易懂
            queue.add(a);
            if (queue.size() > k) {
                queue.poll();
                //这个位置注意
            }
        }
        int[] nums = new int[queue.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = queue.poll();
        }
        return nums;
    }

    //二战 09点44分 2020/5/6
    public int[] getLeastNumbers1(int[] arr, int k) {
        if (arr == null || arr.length == 0) return new int[0];
        Queue<Integer> queue = new PriorityQueue<>((v1, v2) -> v2 - v1);
        for (Integer nums : arr) {
            queue.add(nums);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        int[] nums = new int[queue.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = queue.poll();
        }
        return nums;
    }
}
