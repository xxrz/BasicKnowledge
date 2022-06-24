import java.util.concurrent.*;

public class ExerciseThrealPool {

    public static void testCache(){
        //可缓存的，表示创建的线程的数量无限
        ExecutorService executorService = Executors.newCachedThreadPool();

        //使用线程池，创建线程
        for (int i = 0; i < 10; i++) {
            final int tmp = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    //因为此处是匿名内部类，内部类中的变量引用本地变量，本地变量必须是final类型，否则会因为生命周期不一致而引起错误
                    System.out.println(Thread.currentThread().getName()+","+ tmp);
                }
            });
        }

        executorService.shutdown();
    }

    public static void testFixed(){
        int num = Runtime.getRuntime().availableProcessors();
        System.out.println(num);
        ExecutorService executorService = Executors.newFixedThreadPool(num);

        for (int i = 0; i < 15; i++) {
            final int tmp = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "-" + tmp);
                }
            });
        }

        executorService.shutdown();
    }

    public static void testScheduled(){
        int num = Runtime.getRuntime().availableProcessors();
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(num);
        for (int i = 0; i < 10; i++) {
            final int tmp = i;
            //注意此处调用的是schedule不是execute
            //表示延迟3s后执行
            scheduledExecutorService.schedule(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"-"+ tmp);
                }
            },3, TimeUnit.SECONDS);
        }
        scheduledExecutorService.shutdown();
    }

    public static void testSingle(){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            final int tmp = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "-" + tmp);
                }
            });
        }

        executorService.shutdown();

    }


    public static void main(String[] args) {
//        testCache();
        testFixed();
//        testScheduled();
//        testSingle();
    }
}
