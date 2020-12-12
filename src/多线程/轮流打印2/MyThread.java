package 多线程.轮流打印2;

/**
 * @ClassName MyThread
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/12/9 22:38
 */
public class MyThread implements Runnable {
    private static Object object1 = new Object();
    private static int count = 0;
    int no;

    public MyThread(int no) {
        this.no = no;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (object1) {
                if (count >= 100) {
                    break;
                }
                if (count % 3 == this.no) {
                    System.out.println(this.no + "打印-->" + count);
                    count++;
                } else {
                    try {
                        object1.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                object1.notifyAll();
            }
        }

    }
}