package leetcode.其他;

/**
 * @ClassName _9_回文数
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/19 16:13
 */
public class _9_回文数 {
    public boolean isPalindrome(int x) {
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
}