package leetcode.数组;

/**
 * @ClassName _268_缺失数字
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/13 22:19
 */
public class _268_缺失数字 {
    public int missingNumber(int[] nums) {
        //思路，先让0 和最大值进行异或，然后，让每个数和自己的索引进行异或，剩下的即为缺失数字
        int n = nums.length;
        int res = 0;
        res ^= n;
        for (int i = 0; i < n; i++) {
            res = res ^ i ^ nums[i];
        }
        return res;
    }
}