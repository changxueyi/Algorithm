package leetcode.暴力法;

/**
 * @ClassName _560_和为K的子数组
 * @Description TODO https://leetcode-cn.com/problems/subarray-sum-equals-k/solution/bian-li-qian-zhui-he-by-feng-qi-feng-luo/
 * @Author changxueyi
 * @Date 2020/5/15 7:15
 */
public class _560_和为K的子数组 {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    //优化版，使用hashMap
    /*public int subarraySum1(int[] nums, int k) {

    }*/

}