package 剑指offer.其他;

import java.util.ArrayList;

/**
 * @ClassName _62_圆圈中剩下的数字
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/5 15:50
 */
public class _62_圆圈中剩下的数字 {
    public static int lastRemaining(int n, int m) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(i);
        }
        int cur = 0;
        while (n > 1) {
            cur = (cur + m - 1) % n;
            arr.remove(cur);
            //注意这里需要n--;
            n--;
        }
        return arr.get(0);
    }
}