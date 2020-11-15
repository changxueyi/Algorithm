package leetcode.Top100;

/**
 * @ClassName _53_最大子序列和
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/10/20 20:51
 */
public class _53_最大子序列和 {
    //连续子序列数组和
    public int maxSubArray(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int max = nums[0]; //全局最大值
        int subMax = nums[0]; //前一个子组合的最大值
        for (int i = 1; i < nums.length; i++) {
            if (subMax > 0) {
                subMax = subMax + nums[i];
            }else {
                subMax = nums[i];
            }
            max = Math.max(max,subMax);
        }
        return max;
    }
}