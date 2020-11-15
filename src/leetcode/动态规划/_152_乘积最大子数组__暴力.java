package leetcode.动态规划;

import java.util.Arrays;

/**
 * @ClassName _152_乘积最大子数组__暴力
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/18 13:32
 */
public class _152_乘积最大子数组__暴力 {
    // 子数组肯定是连接在一块的




    public int maxProduct(int[] nums) {
        //暴力破解
        int ans = 1;
        //因为是最大值，先置为最小值，不然返回的就是最大值
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                ans *= nums[j];
                max = Math.max(max, ans);
            }
            //把ans 给置为1
            ans = 1;
        }
        return max;
    }

    //动态规划 DP 解答
    public int maxProduct1(int[] nums) {
        if (nums == null) return 0;
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        //定义dp
        int[][] dp = new int[len][2];
        //dp初始化
        dp[0][0] = nums[0];//dp[i][0]：以nums[i]结束的最大值
        dp[0][1] = nums[0];//dp[i][1]：以nums[i]结束的最小值

        int res = nums[0];
        for (int i = 1; i < len; i++) {
            if (nums[i] >= 0) {
                //说明是正数
                dp[i][0] = Math.max(nums[i], dp[i - 1][0] * nums[i]);
                dp[i][1] = Math.max(nums[i], dp[i - 1][1] * nums[i]);
            } else {
                dp[i][0] = Math.max(nums[i], dp[i - 1][1] * nums[i]);
                dp[i][1] = Math.max(nums[i], dp[i - 1][0] * nums[i]);
            }
            //最终的结果只需要比较最大值即可
            res = Math.max(res, dp[i][0]);
        }
        return res;
    }
}