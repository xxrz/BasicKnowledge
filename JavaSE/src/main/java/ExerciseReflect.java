import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ExerciseReflect {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //方法一：
        //类加载，类连接
        Class<?> listAndArray = Class.forName("ExerciseListAndArray");
        //通过newInstance的方式创建实例，再此之前必须要进行类加载和类链接
        ExerciseListAndArray o = (ExerciseListAndArray)listAndArray.newInstance();
        //执行方法
        o.testArrayToList();


        //方法二：
        Class<?> listAndArray1 = Class.forName("ExerciseListAndArray");
        //通过newInstance的方式创建实例
        ExerciseListAndArray o1 = (ExerciseListAndArray)listAndArray1.newInstance();
        //执行方法
        Method method = listAndArray1.getDeclaredMethod("testArrayToList");
        method.invoke(o1);

        //方法三：
        //通过new的方式创建并执行
        ExerciseListAndArray o2 = new ExerciseListAndArray();
        o2.testArrayToList();
    }
}
