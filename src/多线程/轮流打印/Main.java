package 多线程.轮流打印;

/**
 * @ClassName Main
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/4 15:51
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        /**
         * 这个位置必须是 0 1 2 其他的无效
         */
        /*Thread thread01 = new Thread(new MyThread(0));
        Thread thread02 = new Thread(new MyThread(1));
        Thread thread03 = new Thread(new MyThread(2));*/
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