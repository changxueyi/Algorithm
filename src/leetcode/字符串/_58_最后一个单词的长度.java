package leetcode.字符串;

/**
 * @ClassName _58_最后一个单词的长度
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/17 17:44
 */
public class _58_最后一个单词的长度 {
    public static int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') end--;
        if (end < 0) return 0;
        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') start--;
        return end - start;
    }

    //此方法更好
    public int lengthOfLastWord1(String s) {
        if (s == null || s.length() == 0) return 0;
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (count == 0) continue;
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String a = "Hello World";
        int b = lengthOfLastWord(a);
        System.out.println(b);
    }
}