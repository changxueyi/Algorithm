package 公共Utils.mapTest;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DataTest
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/9/26 18:00
 */
public class DataTest {
    public static void main(String[] args) throws ParseException {
        Date now = new Date();
        /*System.out.println(now);
        System.out.println(now.toString());
        System.out.println(now.toLocaleString());*/
        /*SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = simpleDateFormat.format(now);
        System.out.println(s);*/
        /*SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = simpleDateFormat.parse("2016-11-30 13:14:15");
        System.out.println(d);
        System.out.println(now);*/
        System.out.println(now);
        Long t = now.getTime();
        System.out.println(t);

    }
}