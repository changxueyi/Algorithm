package 剑指offer.数组;

import java.util.HashMap;

/**
 * @ClassName _03_数组中重复的数字
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/4 21:46
 */
public class _03_数组中重复的数字 {
    public int findRepeatNumber(int[] nums) {
        // 1 1 2 2 3
        //  if (nums.length == 0 || nums == null) return -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (map.containsKey(a)) {
                return a;
            } else {
                map.put(a, 1);
            }
        }
        return -1;
    }

    //去除重复数组后，数组剩下的数量
    public static int findRepeatNumber1(int[] nums) {
        if (nums == null) return -1;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    //17点14分 2020/5/15  //排序数组去重
    public static int findRepeatNumber2(int[] nums) {
        if (nums == null) return -1;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4};
        int result = findRepeatNumber1(arr);
        System.out.println(result);
    }
}