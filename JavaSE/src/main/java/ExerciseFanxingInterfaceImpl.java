public class ExerciseFanxingInterfaceImpl implements ExerciseFanxingInterface<String> {
    @Override
    public String func() {
        return "hello";

    }

    public static void main(String[] args) {
        ExerciseFanxingInterfaceImpl testFanxingInterface = new ExerciseFanxingInterfaceImpl();
        String func = testFanxingInterface.func();
        System.out.println(func);
    }
}
