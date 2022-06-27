package InputACM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class twoDArrayACM {
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

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        ArrayList<int[]> res = new ArrayList<>();
        while(!(line=bufferedReader.readLine()).equals("")){
            int[] tmp = StringtoIntegerArray(line);
            res.add(tmp);
        }

        int[][] matrix = new int[res.size()][res.get(0).length];
        for(int i= 0 ;i < matrix.length;i++){
            matrix[i] = res.get(i);
        }
//        Integer[] integers = res.toArray(new Integer[res.size()]);
        System.out.println(Arrays.deepToString(matrix));
    }
}
