public class ExerciseSychronized3 {
    private Object var = new Object();

    public static void main(String[] args) {
        final ExerciseSychronized3 exerciseSychronized3 = new ExerciseSychronized3();

        new Thread(new Runnable() {
            @Override
            public void run() {
                exerciseSychronized3.blockMethod1();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                exerciseSychronized3.blockMethod2();
            }
        }).start();
    }

    public void blockMethod1(){
        synchronized (var){
            for (int i = 0; i < 3; i++) {
                System.out.println("generalMethod1 excute"+i+" time");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void blockMethod2(){
        synchronized (var) {
            for (int i = 0; i < 3; i++) {
                System.out.println("generalMethod2 excute" + i + " time");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
