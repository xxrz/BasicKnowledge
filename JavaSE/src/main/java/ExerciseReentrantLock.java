import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExerciseReentrantLock {
    //类
    private Lock lock  = new ReentrantLock();

    public void test(){
        lock.lock();
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " ");
            }
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ExerciseReentrantLock exerciseReentrantLock = new ExerciseReentrantLock();
        exerciseReentrantLock.test();
    }

}
