package 公共Utils.mapTest;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Test01
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/9/23 9:47
 */
public class Test01 {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("isSuccess", "0000");
        map.put("age", "22");
        Map<String, Object> map1 = new HashMap<>();
        map1.put("name","changxueyi");
        map1.put("age",99);
        map1.put("workName","京东集团");
        map.putAll(map1);
        System.out.println(map.toString());
        System.out.println(map1.toString());
    }

}