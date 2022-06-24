public class ExerciseSingle {
    //饿汉式
    //单例：一个类只能有一个类变量

    //1.私有化构造函数
    private ExerciseSingle(){}
    //2.创建一个类变量
    public static ExerciseSingle single = new ExerciseSingle();
    //3.获取该类变量
    public ExerciseSingle getSingle(){
        return single;
    }
}
