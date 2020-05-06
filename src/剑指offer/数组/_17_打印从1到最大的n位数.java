package 剑指offer.数组;

import java.util.Arrays;

/**
 * @ClassName _17_打印从1到最大的n位数
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/5 8:52
 */
public class _17_打印从1到最大的n位数 {
    public static int[] printNumbers(int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += (int) (9 * Math.pow(10, i));
        }
        int[] arr = new int[result];
        for (int i = 0; i < result; i++) {
            arr[i] = i+1;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = printNumbers(2);
        System.out.println(Arrays.toString(arr));
    }
}