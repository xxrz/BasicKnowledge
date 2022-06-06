import java.util.Random;
import java.util.concurrent.*;

public class DiskMemory {
    //利用countdownlaich应用场景是统计四个盘的容量大小
    private int totalSize;

    public int getSize(){
        return (new Random().nextInt(3) + 1)*100;
    }

    public void setSize(int size){
        totalSize += size;
    }

    public int getTotalSize(){
        return totalSize;
    }
}

class t3{
    public static void main(String[] args) throws InterruptedException {
        //创建线程池
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        //初始化磁盘空间
        DiskMemory diskMemory = new DiskMemory();

        //创建四个线程
        CountDownLatch countDownLatch =  new CountDownLatch(4);

        //完成四个线程的获取
        for (int i = 0; i < 4; i++) {
            executorService.execute(()->{
                //重写runnable 的run方法,实现代码逻辑
                int size = diskMemory.getSize();
                diskMemory.setSize(size);
                System.out.println("线程执行，磁盘大小为："+size);
            });
            //子线程--
            countDownLatch.countDown();
        }

        //唤醒主线程
        countDownLatch.await();
        System.out.println("磁盘总容量为："+diskMemory.getTotalSize());
        //关闭线程池
        executorService.shutdown();
    }
}
