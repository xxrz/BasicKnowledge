public class ExerciseThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("run~");
    }

    public static void main(String[] args) {
        ExerciseThread1 exerciseThread1 = new ExerciseThread1();
        exerciseThread1.start();
    }
}
