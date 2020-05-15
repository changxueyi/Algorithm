package leetcode.动态规划;

import java.util.Arrays;

/**
 * @ClassName _300_最长上升子序列
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/8 16:10
 */
public class _300_最长上升子序列 {
    public int lengthOfLIS(int[] nums) {
        //dp[i] 是以num[i]结尾的最长递增子序列（可不连续）；
        int[] dp = new int[nums.length];
        //dp数组全部初始化为1
        Arrays.fill(dp, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

        }
        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}