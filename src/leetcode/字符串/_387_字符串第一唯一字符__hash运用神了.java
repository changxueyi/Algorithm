package leetcode.字符串;

import java.util.HashMap;
import java.util.Set;

/**
 * @ClassName _387_字符串第一唯一字符__hash运用神了
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/7 10:55
 */
public class _387_字符串第一唯一字符__hash运用神了 {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        // find the index
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}