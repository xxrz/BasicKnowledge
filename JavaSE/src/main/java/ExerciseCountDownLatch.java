import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExerciseCountDownLatch {
    public static void main(String[] args) throws InterruptedException {
        //创建线程池
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        //创建磁盘
        DiskMemory diskMemory = new DiskMemory();

        //设置初始值为子线程的数量
        CountDownLatch countDownLatch = new CountDownLatch(4);

        //for循环是要处理的磁盘的数量
        for (int i = 0; i < 4; i++) {
            //创建线程
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    int size = diskMemory.getSize();
                    diskMemory.setTotalSize(size);
                    System.out.println("线程执行，磁盘大小为：" + size);
                    countDownLatch.countDown();
                }
            });
        }

        //唤醒主线程
        countDownLatch.await();
        System.out.println("磁盘总容量为："+diskMemory.getTotalSize());
        executorService.shutdown();
    }
}

class DiskMemory{
    //利用countDownLatch统计四个盘的容量大小
    private int totalSize;

    public int getTotalSize(){
        return totalSize;
    }

    public void setTotalSize(int size){
        totalSize += size;
    }

    //模拟盘的大小
    public int getSize(){
        return (new Random().nextInt(3)+1)*100;
    }
}
