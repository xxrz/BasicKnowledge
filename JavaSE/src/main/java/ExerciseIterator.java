import java.util.*;

public class  ExerciseIterator{

    public static void testArrayList(){
        //test:ArrayList
        List<Integer>list=new ArrayList<Integer>();
        for(int i=0;i<10;i++)
        {
            list.add(i);
        }
        System.out.println("List 中的所有元素");
        /*
        list.iterator代表返回一个Iterator it
        it.next()表示获取下一个元素，如果是第一次，则获取第一个元素
        it.hasNext()表示查看是否还有下一个元素
         */
        //方式一
        System.out.println("方式一");
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }
        //方式二
        System.out.println("方式二");
        ListIterator<Integer> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            int i = listIterator.next();
            System.out.println(i);

        }

        //方式三:得先让下标到达最后一个位置
        System.out.println("方式三：倒叙");
        while(listIterator.hasPrevious()){
            Integer previous = listIterator.previous();
            System.out.println(previous);

        }
    }

    public static void testLinkedList(){
        //test:LinkedList
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0;i<10;i++)
        {
            list.add(i);
        }

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }
    }

    public static void main(String[] args) {
//        testArrayList();
        testLinkedList();

    }
}
