package leetcode.动态规划;

/**
 * @ClassName _42_连续子数组的最大和
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/16 12:01
 */
public class _42_连续子数组的最大和 {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            //如果是负数，就加上0，dp就等于nums[i]，和上一个dp相比较
            res = Math.max(res, nums[i]);
        }
        return res;
    }

    public int maxSubArray1(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            //res 相当于dp
            res = Math.max(nums[i], res);
        }
        return res;
    }
}