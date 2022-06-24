public class ExerciseLazySingle {
    //懒汉式构建单例

    //1.私有化构造方法
    private ExerciseLazySingle(){}

    //2.创建一个静态类变量，但不创建
    //为什么是volatile：如果存在多线程，则指令重拍可能会导致出错
    public static volatile ExerciseLazySingle exerciseLazySingle;

    //3.获取一个单例，在首次的时候进行创建
    public static ExerciseLazySingle getExerciseLazySingle(){
        //如果有对象，则直接返回
        if(exerciseLazySingle!=null) return exerciseLazySingle;

        //如果没有对象，则创建
        //为什么要加锁：保证只有一个线程在获取ExerciseLazySingle类的资源
        synchronized (ExerciseLazySingle.class){
            //为什么要加判断：如果存在线程竞争，时间片轮转，则会导致可能exerciseLazySingle不为空
            if(exerciseLazySingle==null) {
                exerciseLazySingle = new ExerciseLazySingle();
            }
        }

        return exerciseLazySingle;
    }
}
