package 剑指offer.数组;

import java.util.HashMap;
import java.util.Map;

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
        return i + 1;
    }

    //17点05分 2020/5/15
    public static int  findRepeatNumber1(int[] nums) {
        if (nums.length == 0 || nums == null) return -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (map.containsKey(a)){
                return a;
            }else {
                map.put(a,1);
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {1, 1,1};
        int a = findRepeatNumber1(arr);
        System.out.println(a);
    }
}