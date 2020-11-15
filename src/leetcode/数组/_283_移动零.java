package leetcode.数组;

/**
 * @ClassName _283_移动零0
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/6 15:03
 */
public class _283_移动零 {
    // 0 0 2 3 6 0
    //
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i]  = 0;
        }
    }

}