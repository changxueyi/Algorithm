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
        //其次，题目中的「上升」的意思是「严格上升」，[1, 2, 2, 3] 都不能算作「上升子序列」；
        //dp[i] 是以num[i]结尾的最长递增子序列（可不连续）；
        int[] dp = new int[nums.length];
        //dp数组全部初始化为1
        Arrays.fill(dp, 1);
        for (int i = 0; i < nums.length; i++) {
            //num[5] 表示以5结尾的最大上升子序列，i表示以几结尾的
            for (int j = 0; j < i; j++) {
                //每次都要从0 ，开始往后面一个一个走
                //因为是上升子序列，必须是上升的才可以
                if (nums[i] > nums[j]) {
                    //使用dp[i] 和 dp[j]+1 进行比较
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

        }
        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    //16点47分


}