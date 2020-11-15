package JD;

import java.text.MessageFormat;

/**
 * @ClassName UtilHelper
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/9/4 10:29
 */
public class UtilHelper {
    public static String getCacheKey(String pattern, String... arr) {
        if (pattern == null || arr == null) {
            return "";
        }
        return new MessageFormat(pattern).format(arr);
    }
}