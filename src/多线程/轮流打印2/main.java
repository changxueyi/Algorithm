package 多线程.轮流打印2;

/**
 * @ClassName main
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/12/9 22:38
 */
public class main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread1 = new MyThread(0);
        MyThread myThread2 = new MyThread(1);
        MyThread myThread3 = new MyThread(2);
        Thread thread1 = new Thread(myThread1);
        Thread thread2 = new Thread(myThread2);
        Thread thread3 = new Thread(myThread3);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}