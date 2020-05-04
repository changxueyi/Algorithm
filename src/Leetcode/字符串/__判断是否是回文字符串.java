package Leetcode.字符串;

/**
 * @ClassName __判断是否是回文字符串
 * @Description TODO 这是自己写的题，非leetcode上面
 * @Author changxueyi
 * @Date 2020/5/4 9:43
 */
public class __判断是否是回文字符串 {
    public static boolean fun(String s) {
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "changxueyi";
        Boolean b = fun(s);
        System.out.println(b);
    }
}