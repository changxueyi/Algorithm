package leetcode.暴力法;

import java.util.Arrays;

/**
 * @ClassName _1_两数之和
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/15 8:06
 */
public class _1_两数之和 {
    //适用于排好序的
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int[] arr = new int[2];
        while (right > left) {
            if (nums[left] + nums[right] > target) {
                right--;
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                return new int[]{left, right};
            }
        }
        return new int[0];
    }

    //穷举，暴力解法
    public static int[] twoSum1(int[] nums, int target) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] cur = twoSum1(arr, 9);
        System.out.println(Arrays.toString(cur));
    }
}