public class ExerciseSychronized2 {
    //synchronized修饰在静态方法，锁住的是class实例，因为静态方法属于class而不属于对象
    //所以在此处锁住的是ExerciseSychronized2类，当两个线程在竞争时，thread1先拿到了，就会将fun1执行完才释放给fun2
    public synchronized static void fun1(){
        for (int i = 0; i < 3; i++) {
            System.out.println("fun1 :"+ i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized static void fun2(){
        for (int i = 0; i < 3; i++) {
            System.out.println("fun2 :"+ i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        final ExerciseSychronized2 exerciseSychronized1 = new ExerciseSychronized2();
        final ExerciseSychronized2 exerciseSychronized2 = new ExerciseSychronized2();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                exerciseSychronized1.fun1();
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                exerciseSychronized2.fun2();
            }
        });

        thread2.start();
    }


}