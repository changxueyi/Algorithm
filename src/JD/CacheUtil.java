package JD;

import javafx.beans.binding.DoubleExpression;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/**
 * @ClassName CacheUtil
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/9/8 23:15
 */
public class CacheUtil {

    public static class CacheKey {
        /***
         * 缓存key前缀
         */
        public final static String KEY_PREFIX = "bt:sc:";
        /**
         * 失效未领取积分缓存key
         */
        public final static String INVALID_NOT_RECEIVE_SCORE = KEY_PREFIX + "invalid:not:receive:{0}";
        /**
         * 积分失效
         */
        public final static String VALID_SCORE = KEY_PREFIX + "valid:score:{0}";
        /**
         * 积分过期
         */
        public final static String EXPIRE_SCORE = KEY_PREFIX + "expire:score:{0}";
        /**
         * 消费积分
         */
        public final static String CONSUME_SCORE = KEY_PREFIX + "consume:score:{0}";
        /**
         * 回退积分
         */
        public final static String BACKOFF_SCORE = KEY_PREFIX + "backoff:score:{0}";
        /**
         * 锁定积分
         */
        public final static String LOCK_SCORE = KEY_PREFIX + "lock:score:{0}";
        /**
         * 解锁积分
         */
        public final static String UNLOCK_SCORE = KEY_PREFIX + "lock:score:{0}";
        /**
         * biztype 自增序列
         */
        public final static String BIZTYPE_INCR = KEY_PREFIX + "bizType:ince:sq:{0}:{1}";
        /**
         * 加分缓存记录key
         */
        public final static String ADD_SCORE = KEY_PREFIX + "add:score:{0}:{1}";

        /**
         * 加分防重 pin+biztype+bizid
         */
        public final static String ADD_SCORE_BIZ = KEY_PREFIX + "add:s:biz:{0}:{1}:{2}";

        /**
         * 领取积分防重 pin+流水号
         */
        public final static String RECEIVE_ONE_BIZ = KEY_PREFIX + "receive:one:biz:{0}:{1}";
    }

    /* public final static Long CACHE_TIME_MONTH = 2592000L;
     public final static Long CACHE_TIME_WEEK = 604800L;
     public final static Long CACHE_TIME_DAY = 86400L;
     public final static Long CACHE_TIME_HOUR = 3600L;
     public final static Long CACHE_TIME_MINUTE = 60L;
     public final static Long CACHE_TIME_SECONDS = 3L;*/
    public final static Long CACHE_TIME_MONTH = 2592000L;
    public final static Long CACHE_TIME_DAY = 86400L;
    public final static Long CACHE_TIME_WEEK = 604800L;
    public final static Long CACHE_TIME_HOUR = 3600L;
    public final static Long CACHE_TIME_MINUTE = 60L;
    public final static Long CACHE_TIME_SECONDS = 3L;


    /**
     * cacheTimeIndex
     */
    public enum CacheTimeIndex {
        /**
         * 缓存一个月
         */
        MONTH(1),
        /**
         * 缓存1个星期
         */
        WEEK(2),
        /**
         * 缓存1天
         */
        DAY(3),
        /**
         * 缓存一周
         */
        HOUR(4),
        /**
         * 缓存一分钟
         */
        MINUTE(5);
        public int t;

        CacheTimeIndex(int t) {
            this.t = t;
        }
    }

    public static Integer getCacheTime(CacheTimeIndex i) {
        switch (i.t) {
            case 1:
                return CACHE_TIME_MONTH.intValue();
            case 2:
                return CACHE_TIME_WEEK.intValue();
            case 3:
                return CACHE_TIME_DAY.intValue();
            case 4:
                return CACHE_TIME_HOUR.intValue();
            case 5:
                return CACHE_TIME_MINUTE.intValue();
            case 6:
                return CACHE_TIME_SECONDS.intValue();
            default:
                return CACHE_TIME_MINUTE.intValue();
        }
    }

    public static void main(String[] args) {
       /* int a = getCacheTime(CacheTimeIndex.DAY);
        System.out.println(a);
        System.out.println("************************************");
        String bbb = "changxueyi{0}{1}";
        String ccc = "liyanru";
        String ddd = "love";
        String eee = getCacheKey(bbb, ddd, ccc);
        System.out.println(eee);*/
      /*  String aaa = "changxueyi:";
        String bbb = "love";
        String ccc = "liyanru";
        String eee = getCacheKey(aaa, bbb, ccc);
        System.out.println(eee);*/
        int result = getCacheTime(CacheTimeIndex.DAY);
        System.out.println(result);
    }

    public static String getCacheKey(String pattern, String... arr) {
        if (pattern == null || arr == null) {
            return "";
        }
        return new MessageFormat(pattern).format(arr);
    }

    public static String getCacheKey1(String pattern, String... arr) {
        if (pattern == null || arr == null) {
            return "";
        }
        return new MessageFormat(pattern).format(arr);
    }

    public static String getCacheKey2(String pattern, String... arr) {
        if (pattern == null || arr == null) {
            return "";
        }
        return new MessageFormat(pattern).format(arr);
    }

    public <T, V> List<T> fun(List<V> volist, Class<T> tClass) throws Exception {
        if (null == volist || volist.isEmpty()) {
            return null;
        }
        try {
            List<T> tList = new ArrayList<>();
            for (V score : volist) {
                T t = tClass.newInstance();
                //BeanUtils.copyProperties(score,t);
                tList.add(t);
            }
            return tList;
        } catch (Exception e) {
            throw new Exception();
        }
    }


}