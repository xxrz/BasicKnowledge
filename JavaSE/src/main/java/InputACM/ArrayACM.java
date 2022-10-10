package InputACM;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class ArrayACM {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line=bufferedReader.readLine())!=null){
            int[] nums = StringtoIntegerArray(line);
            String n1 = bufferedReader.readLine();
            int n2 = Integer.valueOf(n1);
            int[] ints = new Solution().arrayTest(nums,n2);

            System.out.println();
        }
    }

    private static int[] StringtoIntegerArray(String line) {
        line = line.trim();
        if(line.length()==0){
            return new int[0];
        }
        String[] tmp = line.split(",");
        int[] arr = new int[tmp.length];
        for(int i = 0;i < tmp.length;i++){
            arr[i] = Integer.valueOf(tmp[i]);
        }

        return arr;

    }

}
