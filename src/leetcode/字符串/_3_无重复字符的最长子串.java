package leetcode.字符串;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName _3_无重复字符的最长子串_滑窗
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/9 17:51
 */
public class _3_无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        //哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        //右指针，初始值为-1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1, ans = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                //左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }

    //用这个简单的方法直接解
    public int lengthOfLongestSubstring1(String s) {
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

    //14点31分 2020/5/21
    public static int lengthOfLongestSubstring2(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int res = 0;
        //为什么这个位置不能等于号?
        //因为走到这里，j会继续++，导致j走向了null,并且啊，j-i不知道在哪里了，所以直接出错
        while (i < s.length() && j < s.length()) {
            if (!set.contains(s.charAt(j))) {
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

    public static void main(String[] args) {
        String s = "bbbbb";
        int a  =lengthOfLongestSubstring2(s);
        System.out.println(a);
    }

}