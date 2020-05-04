package 多线程;

/**
 * @ClassName DeadDemo
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/4 9:56
 */
public class DeadDemo implements Runnable {
    private static Object object1 = new Object();
    private static Object object2 = new Object();
    private int flag = 0;

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag == 0) {
            synchronized (object1) {
                System.out.println(Thread.currentThread().getName() + "拿到object1");
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object2) {
                    System.out.println(Thread.currentThread().getName() + "拿到了object2");
                }
            }
        }
        if (flag == 1) {
            synchronized (object2) {
                System.out.println(Thread.currentThread().getName() + "拿到了object2");
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object1) {
                    System.out.println(Thread.currentThread().getName() + "拿到了object1");
                }
            }
        }
    }

    public static void main(String[] args) {
        DeadDemo demo1 = new DeadDemo();
        DeadDemo demo2 = new DeadDemo();
        demo1.setFlag(0);
        Thread thread1 = new Thread(demo1, "Thread1");
        thread1.start();

        demo2.setFlag(1);
        Thread thread2 = new Thread(demo2, "Thread2");
        thread2.start();
    }
}