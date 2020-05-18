package 剑指offer.数组;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName _21_调整数组顺序使奇数位于偶数前面
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/4 22:09
 */
public class _21_调整数组顺序使奇数位于偶数前面 {
    public static int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (left < nums.length && (nums[left] & 1) == 1) left++;
            while (right >= 0 && (nums[right] & 1) == 0) right--;

            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        return nums;
    }

    public static void reOrderArray(int[] array) {
        int oddCnt = 0;
        for (int val : array) {
            if (val % 2 == 1) {
                oddCnt++;
            }
        }
        //复制一份
        int[] copy = array.clone();
        int i = 0, j = oddCnt;
        for (int num : copy) {
            if (num % 2 == 1) {
                array[i++] = num;
            } else {
                array[j++] = num;
            }
        }
    }

    public static int[] exchange1(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> cur = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & 1) == 1)
                arr.add(nums[i]);
            if ((nums[i] & 1) == 0)
                cur.add(nums[i]);
        }
        arr.addAll(cur);
        int[] aaa = new int[arr.size()];
        for (int i = 0; i < nums.length; i++) {
            aaa[i] = arr.get(i);
        }
        return aaa;
    }

    public static int[] exchange3(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while ((nums[left] & 1) == 1) left++;
            while ((nums[right] & 1) == 0) right--;

            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            } else {
                return nums;
            }
        }
        return nums;
    }

    //11点06分 2020/5/16
    public static int[] exchange4(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (right > left) {
            while (right > left && (nums[left] & 1) == 1) left++;
            while (right > left && (nums[right] & 1) == 0) right--;
            if (right > left) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        return nums;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] aa = exchange4(arr);
        System.out.println(Arrays.toString(aa));
    }
}