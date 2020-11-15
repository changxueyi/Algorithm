package leetcode.动态规划;

/**
 * @ClassName _53_最大子序和_152题对照
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/18 13:45
 */
public class _53_最大子序和_152题对照 {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum =0;
        for(int num:nums){
            if(sum>0){
                sum +=  num;
            }else{
                sum = num;
            }
            ans = Math.max(sum,ans);
        }
        return ans;
    }
}