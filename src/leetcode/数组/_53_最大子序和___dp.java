package leetcode.数组;

/**
 * @ClassName _53_最大子序和___dp
 * @Description TODO https://leetcode-cn.com/problems/maximum-subarray/
 * @Author changxueyi
 * @Date 2020/5/6 15:33
 */
public class _53_最大子序和___dp {
    //根据增益进行比较如果 sum > 0，则说明 sum 对结果有增益效果，则 sum 保留并加上当前遍历数字
    //如果 sum <= 0，则说明 sum 对结果无增益效果，需要舍弃，则 sum 直接更新为当前遍历数字
    //每次比较 sum 和 ans的大小，将最大值置为ans，遍历结束返回结果


    //最容易理解的 其实这道题可以这么想： 1.假如全是负数，那就是找最大值即可，因为负数肯定越加越大。
    // 2.如果有正数，则肯定从正数开始计算和，不然前面有负值，和肯定变小了，所以从正数开始。
    // 3.当和小于零时，这个区间就告一段落了，然后从下一个正数重新开始计算(也就是又回到 2 了)。
    public int maxSubArray(int[] nums) {
        //当前最大连续子序列和为 sum，结果为 ans
        int ans = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }

    public int maxSubArray1(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}