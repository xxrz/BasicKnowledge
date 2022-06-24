public class ExerciseSychronized1 {
    //synchronized作用于成员变量和非静态方法时，锁住的是对象的实例，即this对象
    //所以在此处锁住的是exerciseSychronized对象，当两个线程在竞争同一个对象时，thread1先拿到了，就会将fun1执行完才释放给fun2
    public synchronized void fun1(){
        for (int i = 0; i < 3; i++) {
            System.out.println("fun1 :"+ i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void fun2(){
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
        ExerciseSychronized1 exerciseSychronized = new ExerciseSychronized1();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                exerciseSychronized.fun1();
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                exerciseSychronized.fun2();
            }
        });

        thread2.start();
    }


}
