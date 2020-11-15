package leetcode.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName _3_无重复字符的最长子串
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/19 16:25
 */
public class _3_无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return -1;
        int n = s.length();
        int i = 0;
        int j = 0;
        Set<Character> set = new HashSet<>();
        int res = 0;
        while (i < n && j < n) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(j));
                j++;
                res = Math.max(res, j - i);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return res;
    }
}