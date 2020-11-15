package 多线程.多线程中方法测试;

import java.util.concurrent.Callable;

/**
 * @ClassName TaskWithResult
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/10/20 16:37
 */
public class TaskWithResult implements Callable<String> {
    private  int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        System.out.println("call被拉起来干活："+Thread.currentThread().getName());
        return "JD";
    }
}