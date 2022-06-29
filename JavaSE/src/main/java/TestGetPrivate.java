import java.lang.reflect.Field;

public class TestGetPrivate {
    private int test;

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        //方法一：
        TestGetPrivate testGetPrivate = new TestGetPrivate();
        int test = testGetPrivate.getTest();
        System.out.println(test);

        //方法二：通过反射获取
        Class<?> testGetPrivate1 = Class.forName("TestGetPrivate");
        Object o = testGetPrivate1.newInstance();
        Field[] declaredFields = testGetPrivate1.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            System.out.println(declaredField.getName() + " " + declaredField.get(o));
        }
    }
}


