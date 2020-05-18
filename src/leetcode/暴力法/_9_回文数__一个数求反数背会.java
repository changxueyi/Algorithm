package leetcode.暴力法;

/**
 * @ClassName _9_回文数__一个数求反数背会
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/14 14:40
 */
public class _9_回文数__一个数求反数背会 {
    //此题是阿里面试题
    public boolean isPalindrome(int x) {
        //如果是负数一定不是回文数
        if (x < 0) {
            return false;
        }
        int cur = 0;
        int num = x;
        while (num != 0) {
            cur = cur * 10 + num % 10;
            num = num / 10;//1 2 3
            //第一次 计算个数 cur  = 0*10 + num%10  3
            // num = 12
            //第二次 十位数   cur = 3 + 2 = 5;
        }
        return cur == x;
    }

    public boolean isPalindrome1(int x) {
        //将 int 变量 i 转换成字符串
        String a = String.valueOf(x);
        int b = a.length();
        for (int i = 0; i < b / 2; i++) {
            if (a.charAt(i) == a.charAt(b - 1 - i)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static int fun(int n) {
        int cur = 0;
        int num = n;
        while (num != 0) {
            cur = cur * 10 + num % 10;
            num = num / 10;//1 2 3
        }
        return cur;
    }

    public static void main(String[] args) {
        int a  =fun(789);
        System.out.println(a);
    }


}