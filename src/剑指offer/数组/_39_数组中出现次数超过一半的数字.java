package 剑指offer.数组;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName _39_数组中出现次数超过一半的数字
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/5 15:09
 */
public class _39_数组中出现次数超过一半的数字 {
    //票数和： 由于众数出现的次数超过数组长度的一半；若记 众数 的票数为 +1+1 ，
    //        非众数 的票数为 -1−1 ，则一定有所有数字的 票数和 > 0>0 。
    //票数正负抵消： 设数组 nums 中的众数为 xx ，数组长度为 nn 。若 nums 的前 aa 个数字的 票数和 = 0=0 ，
    //              则 数组后 (n-a)(n−a) 个数字的 票数和一定仍 >0>0 （即后 (n-a)(n−a) 个数字的 众数仍为 xx ）。
    public int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    //摩尔投票法
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        int target = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != target) {
                count--;
            } else if (nums[i] == target) {
                count++;
            }
            if (count == 0) {
                target = nums[i];
                count = 1;
            }
        }
        return target;
    }

    //hash法
    public int fun(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i])>(nums.length/2)){
                return nums[i];
            }
        }
        return 0;
    }
}