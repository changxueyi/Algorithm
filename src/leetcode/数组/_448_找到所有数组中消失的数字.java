package leetcode.数组;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName _448_找到所有数组中消失的数字0
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/6 15:14
 */
public class _448_找到所有数组中消失的数字 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 1; i < nums.length; i++) {
            map.put(nums[i], true);
        }
        List<Integer> result = new LinkedList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)){
                result.add(i);
            }
        }
        return result;

    }
}