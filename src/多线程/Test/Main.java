package 多线程.Test;

import 多线程.轮流打印.MyThread;

/**
 * @ClassName Main
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/5 16:32
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //必须这样写代码，不然就出错
        MyThread thread1 = new MyThread(0);
        MyThread thread2 = new MyThread(1);
        MyThread thread3 = new MyThread(2);
        Thread thread01 = new Thread(thread1);
        Thread thread02 = new Thread(thread2);
        Thread thread03 = new Thread(thread3);
        thread01.start();
        thread02.start();
        thread03.start();
        thread01.join();
        thread02.join();
        thread03.join();
    }
}