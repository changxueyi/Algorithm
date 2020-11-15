package JD;

import com.sun.javaws.CacheUtil;

/**
 * @ClassName Test01
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/9/4 10:25
 */

public class Test01 {
    public static void main(String[] args) {
        String uuid = "changxueyiUUID";
        String key = getRepeatRequestKey(uuid, OperationType.EFFECTIVE);
        System.out.println(key.toString());
    }

    protected static String getRepeatRequestKey(String bizUuid, OperationType operationType) {
        String key = null;
        if (operationType == OperationType.EFFECTIVE) {
            key = UtilHelper.getCacheKey("bt:sc:valid:score:{0}", bizUuid);
        }
        return key;
    }
}