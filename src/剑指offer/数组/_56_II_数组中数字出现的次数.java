package 剑指offer.数组;

import java.util.HashMap;
import java.util.Set;

/**
 * @ClassName _56_II_数组中数字出现的次数
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/14 9:56
 */
public class _56_II_数组中数字出现的次数 {
    public int singleNumber(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return -1;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == 1) {
                return nums[i];
            }
        }
        return -1;

    }
}