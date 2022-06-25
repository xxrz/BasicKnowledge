package ACM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumACM {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);

            int ret = new Solution().sumNums(n);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
}
