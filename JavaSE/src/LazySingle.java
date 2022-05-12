public class LazySingle {
    //1.创建一个私有的构造函数
    private LazySingle(){

    }

    //2. 创建一个静态的对象，但不分配空间
    public static LazySingle lazySingle;

    //3. 提供一个方法创建对象
    public static LazySingle getLazySingle(){
        //提高效率，在加锁前进行判断，如果已存在则直接返回
        if(lazySingle==null){
            synchronized (LazySingle.class){
                //怕有进程抢占
                if(lazySingle==null){
                    lazySingle = new LazySingle();
                }
            }
        }
        return lazySingle;
    }
}
