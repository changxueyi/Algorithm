package leetcode.Top100;

/**
 * @ClassName _136_只出现一次的数字
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/10/20 17:53
 */
public class _136_只出现一次的数字 {
    public int singleNumber(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            a ^= nums[i];
        }
        return a;
    }
}