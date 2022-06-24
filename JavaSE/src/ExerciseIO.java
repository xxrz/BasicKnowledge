import java.io.IOException;
import java.io.InputStream;

public class ExerciseIO {
    public static void testInput() throws IOException {
        InputStream inp = System.in;
        byte[] bytes = new byte[1024];
        try {
            String str="";
            while(inp.read() != -1){
                //根据用户输入的信息创建字符串
                 str = new String(bytes).trim();
            }
            inp.close();        //关闭流
            System.out.println(str);
        } catch (IOException e) {
            // TODO Auto-generated catch bl-1ock
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        testInput();
    }
}
