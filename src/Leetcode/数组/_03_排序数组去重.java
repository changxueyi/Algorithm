package Leetcode.数组;

/**
 * @ClassName _03_排序数组去重
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/2 10:46
 */
public class _03_排序数组去重 {
    public static int findRepeatNumber(int[] nums) {
        if (nums.length == 0 || nums == null) return -1;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public int fun(int[] arr) {
        if (arr.length == 0 || arr == null) return -1;
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3};
        int a = findRepeatNumber(arr);
        System.out.println(a);
    }
}