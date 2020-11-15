package leetcode.动态规划;

/**
 * @ClassName _5_最长回文子串
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/11 14:31
 */
public class _5_最长回文子串 {
    //暴力破解
    public boolean isPalindromic(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public String longestPalindrome(String s) {
        //ans 进行初始化
        String ans = "";
        int max = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            //注意这个位置为啥是 j<=len ，因为如果j=len，执行下面的代码substring,j取的还是最后一个元素
            for (int j = i + 1; j <= len; j++) {
                String test = s.substring(i, j);
                if (isPalindromic(test) && test.length() > max) {
                    ans = s.substring(i, j);
                    max = Math.max(ans.length(), max);
                }
            }
        }
        return ans;
    }


    //labuladong 讲解的答案
     /*string longestPalindrome1(string s) {
        string res;
        for (int i = 0; i < s.size(); i++) {
            // 以 s[i] 为中心的最长回文子串
            string s1 = palindrome(s, i, i);
            // 以 s[i] 和 s[i+1] 为中心的最长回文子串
            string s2 = palindrome(s, i, i + 1);
            // res = longest(res, s1, s2)
            res = res.size() > s1.size() ? res : s1;
            res = res.size() > s2.size() ? res : s2;
        }
        return res;
    }*/
}