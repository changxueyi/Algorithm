package 多线程.多线程中方法测试;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName TestCachedTreadPool
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/10/20 16:22
 */
public class TestCachedTreadPool {
    public static void main(String[] args) {
        ExecutorService executorService1 = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            executorService1.execute(new TestRunnable());
            System.out.println("*************a"+i+"***********");
        }
        executorService1.shutdown();
    }
}