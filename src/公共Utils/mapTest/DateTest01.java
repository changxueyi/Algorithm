package 公共Utils.mapTest;


import com.sun.xml.internal.ws.util.xml.CDATA;

import java.text.DateFormat;
import java.util.Date;

/**
 * @ClassName DateTest01
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/9/26 19:20
 */
public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date();
        //使用默认格式
        DateFormat df1 = DateFormat.getInstance();
        System.out.println(df1.format(date));
        System.out.println("**************");
        DateFormat df3  = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(df3.format(date));

    }
}