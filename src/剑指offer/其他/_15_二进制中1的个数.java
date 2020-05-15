package 剑指offer.其他;

/**
 * @ClassName _15_二进制中1的个数
 * @Description TODO https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/solution/mian-shi-ti-15-er-jin-zhi-zhong-1de-ge-shu-wei-yun/
 * @Author changxueyi
 * @Date 2020/5/5 9:51
 */
public class _15_二进制中1的个数 {
    //根据 与运算 定义，设二进制数字 nn ，则有：
    //若 n \& 1 = 0n&1=0 ，则 nn 二进制 最右一位 为 00 ；
    //若 n \& 1 = 1n&1=1 ，则 nn 二进制 最右一位 为 11 。
    //判断 nn 最右一位是否为 11 ，根据结果计数。
    //将 nn 右移一位（本题要求把数字 nn 看作无符号数，因此使用 无符号右移 操作）。
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            //n>>>=1;
            n = n >>> 1;
        }
        return count;
    }


    public int hammingWeight1(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n = n>>>1;
        }
        return count;
    }

}