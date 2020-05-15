package leetcode.数组;

import java.util.Arrays;

/**
 * @ClassName _977_有序数组的平方
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/9 15:47
 */
public class _977_有序数组的平方 {
    public int[] sortedSquares(int[] A) {
        int N = A.length;
        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            ans[i] = A[i]*A[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}