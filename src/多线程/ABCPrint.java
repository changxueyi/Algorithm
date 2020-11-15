package 多线程;

/**
 * @ClassName ABCPrint
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/19 10:39
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//使用Lock
public class ABCPrint{
    private static int state = 0;
    public static void main(String[] args) {
        final Lock lock = new ReentrantLock();

        Thread A = new Thread(new Runnable() {
            @Override public void run() {
            while (state <= 30) {
                lock.lock();

                try {
                    if (state % 3 == 0) {
                        System.out.print("A");
                        state++;
                    }
                } finally {
                    lock.unlock();

                }
            }
        }
        });

        Thread B = new Thread(new Runnable() {
            @Override public void run() {
            while (state <= 30) {
                lock.lock();

                try {
                    if (state % 3 == 1) {
                        System.out.print("B");
                        state++;
                    }
                } finally {
                    lock.unlock();

                }
            }
        }
        });

        Thread C = new Thread(new Runnable() {
            @Override public void run() {
            while (state <= 30) {
                lock.lock();
                try {
                    if (state % 3 == 2) {
                        System.out.println("C");
                        state++;
                    }
                } finally {
                    lock.unlock();

                }
            }
        }
        });
        A.start();
        B.start();
        C.start();
    }
}