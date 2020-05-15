package leetcode.数组;

/**
 * @ClassName _189_旋转数组
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/7 14:33
 */
public class _189_旋转数组 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        for (int i=0;i<k;i++) {
            for (int j=nums.length-1;j>0;j--) {
                //swap
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
            }
        }
    }
}