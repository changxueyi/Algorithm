package 多线程;

import java.beans.DesignMode;

/**
 * @ClassName DeadDemo2
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/4 15:30
 */
public class DeadDemo2 extends Thread {
    private static Object object1 = new Object();
    private static Object object2 = new Object();

    private int flag = 1;

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag == 1) {
            synchronized (object1) {
                System.out.println(Thread.currentThread().getName() + "获得了object1");
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object2) {
                    System.out.println(Thread.currentThread().getName() + "获得了object2");
                }
            }
        }
        if (flag == 2) {
            synchronized (object2) {
                System.out.println(Thread.currentThread().getName() + "获得了object2");
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            synchronized (object1) {
                System.out.println(Thread.currentThread().getName() + "获得了object1");
            }
            }

        }

    }

    public static void main(String[] args) {
        DeadDemo2 demo1 = new DeadDemo2();
        DeadDemo2 demo2 = new DeadDemo2();

        demo1.setFlag(1);
        Thread thead1 = new Thread(demo1,"thead-1");
        thead1.start();

        demo2.setFlag(2);
        Thread thead2 = new Thread(demo2,"thead-2");
        thead2.start();
    }
}