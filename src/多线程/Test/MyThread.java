package 多线程.Test;

import javax.jws.Oneway;

/**
 * @ClassName MyThread
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/5 16:32
 */
public class MyThread implements Runnable {
    private static Object object01 = new Object();
    int count = 0;
    int no;
    public MyThread(int no){
        this.no = no;
    }

    @Override
    public void run() {
        while (true){
            synchronized (object01){
                if (count>100){
                    break;
                }
                if (count%3==this.no){
                    System.out.println(this.no + "打印-->" + count);
                    count++;
                }else {
                    try {
                        object01.wait();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
                object01.notifyAll();
            }
        }
    }
}