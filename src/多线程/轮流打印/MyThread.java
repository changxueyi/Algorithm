package 多线程.轮流打印;

/**
 * @ClassName MyThread
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/4 15:54
 */
public class MyThread implements Runnable {
    private static Object objece1 = new Object();
    private static int count = 0;
    int no;

    public MyThread(int no) {
        this.no = no;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (objece1) {
                if (count > 100) {
                    break;
                }
                //这个位置 上次遇到问题，耽误了半个小时
                if (count % 3 == this.no) {
                    System.out.println(this.no + "打印-->" + count);
                    count++;
                } else {
                    try {
                        objece1.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                objece1.notifyAll();
            }
        }
    }
}