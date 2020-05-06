package 多线程.Test;

/**
 * @ClassName SCJYS
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/5 16:28
 */
public class SCJYS {
    private static volatile SCJYS instance;
    private SCJYS(){};
    public static SCJYS getInstance(){
        if (instance==null){
            synchronized (SCJYS.class){
                if (instance==null){
                    instance = new SCJYS();
                }
            }
        }
        return instance;
    }
}