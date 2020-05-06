package 多线程.Test;

/**
 * @ClassName EHS
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/5 16:27
 */
public class EHS {
    private static EHS instance = new EHS();
    private EHS(){};
    public static EHS getInstance(){
        return instance;
    }
}