package 多线程.Test;

/**
 * @ClassName LHS
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/5 16:25
 */
public class LHS {
    private static LHS instance;
    private LHS(){};
    public static  LHS getInstance(){
        if (instance==null){
            instance = new LHS();
        }
        return instance;
    }
}