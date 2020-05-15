package leetcode.Test;

import java.util.Arrays;

/**
 * @ClassName QuickSort
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/10 14:31
 */
public class QuickSort {
    public static void QuikSort(int[] arr, int L, int R) {
        if (R < L) {
            return;
        }
        int left = L;
        int right = R;
        int pivot = arr[left];
        while (right > left) {
            while (right > left && arr[left] < pivot) {
                left++;
            }
            if (right > left) {
                arr[right] = arr[left];
            }
            while (right > left && arr[right] >= pivot) {
                right--;
            }
            if (right > left) {
                arr[left] = arr[right];
            }
            if (left >= right) {
                //注意这个位置
                arr[left] = pivot;
            }
        }
        QuikSort(arr, L, left - 1);
        QuikSort(arr, left + 1, R);

    }

    public static void main(String[] args) {
        //测试不要举例0
        int[] arr = {1, 2, 2, 4};
        QuikSort(arr, 0, arr.length - 1);
        System.out.println("排序后:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}