package 剑指offer.字符串;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName _50_第一个只出现一次的字符
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/6 9:28
 */
public class _50_第一个只出现一次的字符 {
    public static char firstUniqChar(String s) {
        if (s.length() == 0 || s == null) return ' ';
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int b = map.get(c);
                map.put(c, ++b);
            } else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i))==1){
                return s.charAt(i);
            }
        }
        return ' ';

    }
}