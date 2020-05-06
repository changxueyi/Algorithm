package 剑指offer.数组;

import java.util.HashMap;

/**
 * @ClassName _53_在排序数组中查找数字
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/6 10:18
 */
public class _53_在排序数组中查找数字 {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int c = nums[i];
            if (map.containsKey(c)) {
                int b = map.get(c);
                map.put(c, ++b);
            } else {
                map.put(c, 1);
            }
        }
        if (map.containsKey(target)) {
            return map.get(target);
        } else {
            return 0;
        }
    }

    public static int search1(int[] nums, int target) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                j++;
            }
        }
        return j;
    }

    public static int search3(int[] nums, int target) {
        int res = 0;
        for (int num : nums) {
            if (num == target) {
                res++;
            } else if (res > 0) {
                break;
            }
        }
        return res;
    }


}