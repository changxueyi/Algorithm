package leetcode.数组;

import java.util.Arrays;

/**
 * @ClassName _88_合并两个有序数组
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/11 22:22
 */
public class _88_合并两个有序数组 {
    //双指针 + 从后向前，两个指针分别指向最后一个元素，谁大，就把谁放在最后一个元素上面
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        int i = m - 1;//数组 nums1 的指针
        int j = n - 1;//数组 nums2 的指针
        //nums1 和 nums2 有一个先走完就退出
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[index--] = nums1[i--];
            } else {
                nums1[index--] = nums2[j--];
            }
        }
        while (i >= 0) {
            //说明j走完了
            nums1[index--] = nums1[i--];
        }
        while (j >= 0) {
            //说明i 走完了
            nums1[index--] = nums2[j--];
        }
    }


    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        int i = m - 1;//数组 nums1 的指针
        int j = n - 1;//数组 nums2 的指针
        //nums1 和 nums2 有一个先走完就退出
        while (index >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[index] = nums1[i];
                i -= 1;
            } else {
                nums1[index] = nums2[j];
                j -= 1;
            }
            i -= 1;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 8, 9, 0, 0, 0};
        int[] arr2 = {1, 2, 3};
        merge(arr1,3,arr2,3);
        System.out.println(Arrays.toString(arr1));
    }
}