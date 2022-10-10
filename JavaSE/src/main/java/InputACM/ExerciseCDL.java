package InputACM;
public class ExerciseCDL implements Runnable{

//    private int cnt = 9;
//    @Override
//    public void run() {
//        while(true){
//            //要考虑加锁
//            synchronized (ExerciseCDL.class){
//                if(cnt==0){
//                    System.out.println("数字为0，结束递减");
//                    break;
//                }
//                cnt--;
//                System.out.println(Thread.currentThread().getName()+":cnt:"+cnt);
//            }
//
//        }
//    }
//
//    public static void main(String[] args) {
//        //设置初始值为子线程的数量
//        ExerciseCDL MyThread = new ExerciseCDL();
//        Thread thread1 = new Thread(MyThread);
//        Thread thread2 = new Thread(MyThread);
//        Thread thread3 = new Thread(MyThread);
//        thread1.start();
//        thread2.start();
//        thread3.start();
//    }

    private int cnt = 9;
    @Override
    public void run() {
        while(true){
            //要考虑加锁
            synchronized (ExerciseCDL.class){
                if(cnt==0){
                    break;
                }
                cnt--;
                System.out.println(Thread.currentThread().getName()+":cnt:"+cnt);
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        //设置初始值为子线程的数量
        ExerciseCDL MyThread = new ExerciseCDL();
        Thread thread1 = new Thread(MyThread);
        Thread thread2 = new Thread(MyThread);
        Thread thread3 = new Thread(MyThread);
        thread1.start();
        thread2.start();
        thread3.start();
//        //主线程等三个线程都执行完，才开始写数字
//        thread1.join();
//        thread2.join();
//        thread3.join();
//        System.out.println("数字为0，结束递减");
//        while(true){
//            if(MyThread.cnt==0){
//                break;
//            }
//        }
//
//        System.out.println("数字为0，结束递减");
        if(MyThread.cnt==0){
            System.out.println("数字为0，结束递减");
        }


    }
}
