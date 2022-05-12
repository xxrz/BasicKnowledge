public class Single {
    //饿汉式加载

    //1.创建一个私有的构造函数
    private Single(){}

    //2.创建一个静态的single实例
    public static Single s = new Single();

    //3. 创建一个方法获取single实例
    public static Single getSingle(){
        return s;
    }
}
