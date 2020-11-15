package leetcode.滑动窗口;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName _3_无重复字符的最长子串_滑窗
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/17 14:52
 */
public class _3_无重复字符的最长子串_滑窗 {
    //采用滑动窗口+Set
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int res = 0;
        int i = 0, j = 0;
        while (i < s.length() && j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                res = Math.max(res, j - i);
            } else {
                //包含了这个元素，就要更新滑动窗口的大小了
                set.remove(s.charAt(i));
                i++;
            }
        }
        return res;
    }

    //14点59分 2020/5/18 继续战斗
    public int lengthOfLongestSubstring1(String s) {
        if (s.length() == 0 || s == null) return 0;
        Set<Character> set = new HashSet<>();
        //遍历s,如果存在这个元素，就。。，如果不存在就。。。。
        int i = 0, j = 0;
        int res = 0;
        while (i < s.length() && j < s.length()) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
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