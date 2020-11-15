package 公共Utils.mapTest;

import java.text.MessageFormat;

/**
 * @ClassName UtilHelper
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/9/24 9:56
 */
public class UtilHelper {
    public static String messageFormat(String pattern, Object[] arr) {
        if (pattern == null || arr == null) {
            return "";
        }
        return new MessageFormat(pattern).format(arr);
    }
}