package JD;

import java.text.MessageFormat;

/**
 * @ClassName Test02
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/9/7 11:24
 */
public class Test02 {
    public static String getCacheKey(String pattern, String... arr) {
        if (pattern == null || arr == null) {
            return "";
        }
        return new MessageFormat(pattern).format(arr);
    }

    public static void main(String[] args) {
        String result = getCacheKey("backoff:sore:{0}:{1}:{2}","changxueyi","love","liyanru");
        System.out.println(result);
    }
}