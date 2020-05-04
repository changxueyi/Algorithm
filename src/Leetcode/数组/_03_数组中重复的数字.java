package Leetcode.数组;

import java.util.HashMap;

/**
 * @ClassName _03_数组中重复的数字
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/4 21:46
 */
public class _03_数组中重复的数字 {
    public int findRepeatNumber(int[] nums) {
        // 1 1 2 2 3
      //  if (nums.length == 0 || nums == null) return -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (map.containsKey(a)){
                return a;
            }else {
                map.put(a,1);
            }
        }
        return -1;
    }
}