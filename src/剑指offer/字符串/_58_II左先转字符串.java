package 剑指offer.字符串;

/**
 * @ClassName _58_II左先转字符串
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/5 8:45
 */
public class _58_II左先转字符串 {
    public String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = n; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}