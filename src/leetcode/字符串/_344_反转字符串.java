package leetcode.字符串;

/**
 * @ClassName _344_反转字符串
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/17 17:06
 */
public class _344_反转字符串 {
    public void reverseString(char[] s) {
        int n = s.length - 1;
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[n-i];
            s[n-i] = temp;
        }
    }
}