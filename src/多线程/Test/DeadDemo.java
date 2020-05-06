package 多线程.Test;


/**
 * @ClassName DeadDemo
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/5 15:59
 */
public class DeadDemo implements Runnable {
    private static Object object1 = new Object();
    private static Object object2 = new Object();
    //如果这里是static 的话，下面就不要写set方法，不然直接出错
    private  int flag = 1;
    public void setFlag(int flag){
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag == 1) {
            synchronized (object1) {
                System.out.println(Thread.currentThread().getName() + "获得了object1");
                try {
                    Thread.sleep(800);
                } catch (Exception e) {
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
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (object1) {
                    System.out.println(Thread.currentThread().getName() + "获得了object1");
                }
            }
        }
    }

    public static void main(String[] args) {
        DeadDemo demo1 = new DeadDemo();
        DeadDemo demo2 = new DeadDemo();

        demo1.setFlag(1);
        Thread thread01 = new Thread(demo1,"thread1");
        thread01.start();

        demo2.setFlag(2);
        Thread thread02 = new Thread(demo2,"thread2");
        thread02.start();
    }
}