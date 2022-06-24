import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class  ExerciseIterator{

    public static void main(String[] args) {

        int[] data = {1,2,3,4};
        List<Integer> list = new ArrayList<>(data);

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
}
