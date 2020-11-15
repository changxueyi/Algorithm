package leetcode.Test;

/**
 * @ClassName _283_移动零0
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/25 9:37
 */
public class _283_移动零 {
    public void moveZeroes(int[] nums) {
        if (nums == null) return;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }
    }
}