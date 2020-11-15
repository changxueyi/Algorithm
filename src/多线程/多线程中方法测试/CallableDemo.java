package 多线程.多线程中方法测试;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @ClassName CallableDemo
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/10/20 16:31
 */
public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Future<String>> result = new ArrayList<>();
        //创建10个任务执行
        for (int i = 0; i < 10; i++) {
            //使用ExecutorService执行Callable 类型的任务,并将结果保存在future变量中
            Future<String> future = executorService.submit(new TaskWithResult(i));
            result.add(future);
        }

        for (Future<String> fs :result){
            try {
                System.out.println("changxueyi-->"+fs.get());
                //TODO
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }finally {
                executorService.shutdown();
            }
        }
    }
}