public class ExerciseThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("run!");
    }

    public static void main(String[] args) {
        ExerciseThread2 exerciseThread2 = new ExerciseThread2();
        Thread thread = new Thread(exerciseThread2);
        thread.start();
    }
}
