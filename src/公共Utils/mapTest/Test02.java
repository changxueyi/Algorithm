package 公共Utils.mapTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName Test02
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/9/26 17:01
 */
public class Test02 {
    public static void main(String[] args) throws Exception {
        /*SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormat.parse(simpleDateFormat.format(new Date())+" "+"1111111111"));*/
        String str = "2013-01-21 15:10:20";
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd-HH:mm:ss");
        try {
            System.out.println("AAAAAAAAAAAA");
            date = sdf.parse(str);
            System.out.println("changxueyi");
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(date);
    }

}