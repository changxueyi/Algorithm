package leetcode.Top100;

/**
 * @ClassName _1_两数之和
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/10/21 15:06
 */
public class _1_两数之和 {
    public int[] fun(int[] nums, int target) {
        if (nums == null) {
            return null;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    //两数之和
    public int[] fun1(int[] nums, int target) {
        if (nums == null) {
            return null;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum ==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}