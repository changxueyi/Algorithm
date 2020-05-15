package leetcode.排序;

import java.util.Arrays;

/**
 * @ClassName _快速排序
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/10 14:07
 */
public class _快速排序 {
    public static void QuickSort(int[] arr, int L, int R) {
        if (L > R) {
            return;
        }
        //定义一个pivot
        int left = L;
        int right = R;
        int privot = arr[left];
        while (right > left) {
            while (right > left && arr[right] >= privot) {
                right--;
            }
            if (right > left) {
                arr[left] = arr[right];
            }
            while (right > left && arr[left] < privot) {
                left++;
            }
            if (right > left) {
                arr[right] = arr[left];
            }
            if (left >= right) {
                arr[left] = privot;
            }
        }
        QuickSort(arr, L, left - 1);
        QuickSort(arr, left + 1, R);
    }

    //14点30分

    public static void main(String[] args) {
        int[] arr = {1, 2, 4,1,1, 6, 9, 3, 2};
        QuickSort(arr, 0, arr.length-1);
        System.out.println("排序后:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}