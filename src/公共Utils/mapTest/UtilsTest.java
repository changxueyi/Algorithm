package 公共Utils.mapTest;

/**
 * @ClassName UtilsTest
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/9/24 9:55
 */
public class UtilsTest {
    public static String build(String pin, String bizType) {
        return UtilHelper.messageFormat("15937063052{0}{1}", new Object[]{pin, bizType});
    }

    public static void main(String[] args) {
        String pin = "changxueyi";
        String bizType = "liyanru";
        String result = build(pin,bizType);
        System.out.println(result);
    }
}