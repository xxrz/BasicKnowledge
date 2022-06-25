public class ExerciseFanxing<T> {
    private T key;
    public ExerciseFanxing(T key){
        this.key = key;
    }

    public T getKey(){
        return key;
    }

    public static <E> void printArray(E[] inputArray){
        for (E e : inputArray) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
//        ExerciseFanxing<Integer> integerExerciseFanxing = new ExerciseFanxing<>(2);
//        Integer key = integerExerciseFanxing.getKey();
//        System.out.println(key);


        Integer[] arr= {1,2,3,4};
        printArray(arr);

    }
}
