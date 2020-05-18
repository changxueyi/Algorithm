package 剑指offer.字符串;

/**
 * @ClassName _58_I翻转单词顺序
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/17 17:39
 */
public class _58_I翻转单词顺序 {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        s = s.trim();
        int i = s.length() - 1;
        int j = s.length() - 1;
        while (i > 0) {
            while (s.charAt(i) != ' ' && i >= 0) i--;
            String a = s.substring(i + 1, j + 1);
            res.append(a + " ");
            while (i >= 0 && s.charAt(i) == ' ') i--;
            j = i;
        }
        return res.toString().trim();
    }
}