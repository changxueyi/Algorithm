package 剑指offer.数组;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName _57_II和为s的连续正数序列
 * @Description TODO https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/
 * @Author changxueyi
 * @Date 2020/5/5 10:51
 */
public class _57_II和为s的连续正数序列 {
    public static int[][] findContinuousSequence(int target) {
        //使用滑动窗口      左闭右开区间。
        int i = 1;
        int j = 1;
        int sum = 0;
        List<int[]> res = new ArrayList<>();
        while (i <= target / 2) {
            if (sum < target) {
                //有边界向右移动，下面的顺序不能乱 /**************特别注意下面的顺序不能乱变
                sum += j;
                j++;
            } else if (sum > target) {
                //左边界向右移动
                sum -= i;
                i++;
            } else {
                //记录结果
                int[] arr = new int[j - i];
                for (int k = i; k < j; k++) {
                    arr[k - i] = k;
                }
                res.add(arr);
                sum -= i;
                i++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }




    public static void main(String[] args) {
        int[][] result = findContinuousSequence(9);
        System.out.println(result);
    }
}