package 剑指offer.数组;

/**
 * @ClassName _57_和为s的连续正数序列
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/5 15:40
 */
public class _57_和为s的连续正数序列 {
    public int[] twoSum1(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (j > i) {
            if ((nums[i] + nums[j]) > target) {
                j--;
            } else if ((nums[i] + nums[j]) < target) {
                i++;
            } else {
                return new int[]{nums[i], nums[j]};
            }
        }
        return new int[0];
    }
}