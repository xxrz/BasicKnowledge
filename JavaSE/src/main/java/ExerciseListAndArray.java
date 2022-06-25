import com.sun.javaws.IconUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciseListAndArray {


    //我把list和arr一直搞反了
    //list是列表：ArrayList,LinkedList
    //arr是数组：int[]
    public void testArrayToList(){


        //方法一：
        int[] list = {1,2,3,4,5,6};
        List<Integer> arr =  new ArrayList<>();

        for(int i: list){
            arr.add(i);
        }
        System.out.println(arr);

        //方法二：
        //注意不能采用Arrays.aslist(list.asList());长度会不对
        List list1 = new ArrayList(Arrays.asList(1,2,3,4,5,6));
        System.out.println(list);

//        //方法三：java 9
        int[] arr1 = {1,2,3,4,5,6};
//        List<Integer> nums = List.of(1,2);

        //方法四：java 8
        List<Integer> collect = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        System.out.println(collect);

        //如果是包装类则无需装箱
        Integer[] arr2 = {1,2,3,4};
        List<Integer> collect1 = Arrays.stream(arr2).collect(Collectors.toList());
        System.out.println(collect1);
    }


    public static void testListToArray(){
        List<Integer> list1 = new ArrayList<Integer>();
        for(int i=0;i<10;i++)
        {
            list1.add(i);
        }
        Integer[] integers = list1.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integers));
    }

    public static void main(String[] args) {
//        testArrayToList();
        testListToArray();

    }
}
