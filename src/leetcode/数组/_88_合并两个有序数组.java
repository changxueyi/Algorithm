package leetcode.数组;

/**
 * @ClassName _88_合并两个有序数组
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/11 22:22
 */
public class _88_合并两个有序数组 {
    //双指针 + 从后向前，两个指针分别指向最后一个元素，谁大，就把谁放在最后一个元素上面
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = nums1.length - 1;
        int tail1 = m - 1;
        int tail2 = n - 1;
        while (tail2 >= 0) {
            if (index >= 0 && tail2 >= 0) {
                nums1[index--] = nums2[tail2--];
            }else if (nums1[tail1]>=nums2[tail2]){
                nums1[index--] = nums1[tail1--];
            }else {
                nums1[index--] = nums2[tail2--];
            }
        }
    }

}