import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ExerciseIO {
    /**
     * 控制台输出
     */
    public static void ScannerInputAndOut(){
        //输入
        Scanner scanner = new Scanner(System.in);
        //输出
        System.out.println(scanner.nextLine());
    }


    /**
     * 字节流
     * @param
     */
    public static void ByteInputAndOut() throws IOException {
        //定义一个接受字节输入的变量
        BufferedInputStream bufferedInputStream = new BufferedInputStream(System.in);
        //声明一个byte数组作为buffer
        byte[] bytes = new byte[1024];
        int bytesRead = 0;
//        //bufferInpuStream.read一次读取输入流的一个字节
//        //将文本内容循环读入到buffer中
//        while((bytesRead = bufferedInputStream.read(bytes))!=-1){
////            将buffer转换为字符串，打印到控制台
//            String s = new String(bytes, 0, bytesRead);
//            System.out.println(s);
//        }

        //bufferInputStream.read一次可读取多个字节，读入到bytes的buffer中
        bufferedInputStream.read(bytes);
        System.out.println(new String(bytes));
        bufferedInputStream.close();

//        输出
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(System.out);
        for (int i = 0; i < 5; i++) {
            bufferedOutputStream.write("hello".getBytes());
        }
        bufferedOutputStream.close();

    }

    /**
     * 字符流
     */
    public static void CharInputAndOut() throws IOException {
        //输入
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(bufferedReader.readLine());

        //输出
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < 5; i++) {
            bufferedWriter.write("hello" + i);
            //换行
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    /**
     * 基于字节流的文件输入输出
     * @throws IOException
     */
    public static void FileInputAndOutput() throws IOException {
        //输出
        File file1 = new File("test.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        for (int i = 0; i < 5; i++) {
            fileOutputStream.write(String.valueOf(i).getBytes());
        }
        fileOutputStream.close();


        //输入
        File file = new File("test.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytes = new byte[1024];
        fileInputStream.read(bytes);
        System.out.println(new String(bytes));
        fileInputStream.close();
    }

    /**
     * url输入
     */
    public static void UrlInput() throws IOException {
        URL url = new URL("http://www.baidu.com");

        /* 字节流 */
        InputStream is = url.openStream();

        /* 字符流 */
        InputStreamReader isr = new InputStreamReader(is, "utf-8");

        /* 提供缓存功能 */
        BufferedReader br = new BufferedReader(isr);

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
//        ScannerInputAndOut();
//        ByteInputAndOut();
//        CharInputAndOut();
//        UrlInput();
        FileInputAndOutput();
    }
}
