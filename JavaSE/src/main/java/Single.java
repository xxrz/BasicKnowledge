import java.lang.ref.SoftReference;

public class Single {
//
//    //饿汉式
//    public static Single single = new Single();
//
//    private Single(){
//
//    }
//
//    public Single getSingle(){
//        return single;
//    }

//    public volatile static Single single;
//
//    private Single(){}
//
//    public Single getSingle(){
//
//        if(single!=null) return single;
//
//        //保证只有一个类可以获取资源
//        synchronized (Single.class){
//            //时间片轮转
//            if(single==null){
//                single = new Single();
//            }
//        }
//
//
//        return single;
//    }
public static void main(String[] args) {
    byte[] cache = new byte[100*1024*1024];
    SoftReference<byte[]> softReference = new SoftReference<>(cache);
    //将缓存数据的强引用去除
    cache = null;

    softReference.get();
}
}
