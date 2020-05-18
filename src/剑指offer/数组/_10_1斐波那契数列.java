package 剑指offer.数组;

/**
 * @ClassName _10_1斐波那契数列
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/16 10:12
 */
public class _10_1斐波那契数列 {
    public int fib(int n) {
        if (n == 1) {
            return 1;
        }
        if (n==0){
            return 0;
        }
        int first = 0;
        int second = 1;
        for (int i = 0; i < n - 1; i++) {
            int sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }
}