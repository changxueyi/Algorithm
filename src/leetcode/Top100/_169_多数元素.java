package leetcode.Top100;


import java.util.Arrays;

/**
 * @ClassName _169_多数元素
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/10/20 18:07
 */
public class _169_多数元素 {
    public int majorityElement(int[] nums) {
        //既然超过了一半
        Arrays.sort(nums);
        return nums[nums.length/2];

    }
}