package leetcode.Test;

/**
 * @ClassName _88_合并两个有序数组
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/23 14:48
 */
public class _88_合并两个有序数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        int i = nums1.length - 1;
        int j = nums2.length - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[index--] = nums1[i--];
            } else {
                nums1[index--] = nums2[j--];
            }
        }
        while (i >= 0) {
            //说明j 走完了
            nums1[index--] = nums1[i--];
        }
        while (j >= 0) {
            //说明i 走完了
            nums1[index--] = nums2[j--];
        }
    }
}