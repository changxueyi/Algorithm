package 剑指offer.数组;

import 剑指offer.链表.ListNode;

/**
 * @ClassName _05_替换空格
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/2 16:57
 */
public class _05_替换空格 {
    public String replaceSpace(String s) {
        if (s == null || s.length() == 0) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public String replaceSpace1(String s) {
        if (s == null) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}