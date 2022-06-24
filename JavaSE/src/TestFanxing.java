import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class TestFanxing {
    public static void main(String[] args) throws NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InvocationTargetException {

        // 新建一个int集合，添加元素
        ArrayList<Integer> strArr =new ArrayList<Integer>();
        strArr.add(123);

        // 现在要将abc添加进去
        // 获取成员方法
        Class c = strArr.getClass();
        Method method = c.getMethod("add", Object.class);
        // 执行方法
        method.invoke(strArr, "abc");
        System.out.println(strArr);
    }
//    public static void main(String[] args) {
//        int a;
//        String  s;
//        System.out.println("a:");
//    }
}