package leetcode.Top100;

/**
 * @ClassName _70_爬楼梯
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/10/21 14:35
 */
public class _70_爬楼梯 {
    //每一次可以爬一个楼梯或者两个楼梯
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

    public int fun(int n) {
        if (n == 1) {
            return 1;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third  = first + second ;
            first = second;
            second = third;
        }
        return second;
    }
}