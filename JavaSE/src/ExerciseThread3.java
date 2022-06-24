import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ExerciseThread3 implements Callable {
    @Override
    public Integer call(){
        return 123;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExerciseThread3 exerciseThread3 = new ExerciseThread3();
        FutureTask<Integer> integerFutureTask = new FutureTask<Integer>(exerciseThread3);
        Thread thread = new Thread(integerFutureTask);
        thread.start();
        System.out.println(integerFutureTask.get());
    }
}
