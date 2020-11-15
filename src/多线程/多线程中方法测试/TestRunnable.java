package 多线程.多线程中方法测试;

/**
 * @ClassName TestRunnable
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/10/20 16:23
 */
public class TestRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程被调用了");
        while (true) {
            try {
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}