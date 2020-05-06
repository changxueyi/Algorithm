package 剑指offer.数组;

import java.util.ArrayList;

/**
 * @ClassName _62_圆圈中最后剩下数字
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/4 17:16
 */
public class _62_圆圈中最后剩下数字 {
    public static int lastRemaining(int n, int m) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(i);
        }
        int idx = 0;
        while (n > 1) {
            idx = (idx + m - 1) % n;
            arr.remove(idx);
            n--;
        }
        return arr.get(0);
    }
}