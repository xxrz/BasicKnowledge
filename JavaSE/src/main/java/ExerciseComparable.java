import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ExerciseComparable implements Comparable<ExerciseComparable>{

    private char c;

    public int getC(){
        return c;
    }

    @Override
    public int compareTo(ExerciseComparable o) {
        return this.c - o.getC();
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(5);
        nums.add(0);
        Collections.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2; // 逆序
            }
        });

        System.out.println(nums);
    }
}
