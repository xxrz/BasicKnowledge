import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.*;

public class test {

    /**
     * 字节数组转16进制
     * @param bytes 需要转换的byte数组
     * @return  转换后的Hex字符串
     */
    public static String bytesToHex(byte[] bytes) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < bytes.length; i++) {
            String hex = Integer.toHexString(bytes[i] & 0xFF);
            if (hex.length() < 2) {
                sb.append(0);
            }
            sb.append(hex);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        byte[] data1 ={0x1,0x1,0x1,0x1};
        String x = bytesToHex(data1);
        x.hashCode();

        System.out.println(x);
//        Hashtable<Integer,Integer> map = new ConcurrentHashMap<>();



    }

//    std::string intToHexString(int i) {
//        std::stringstream ss;
//        ss << std::hex << std::showbase << i;
//        return ss.str();
//    }
//
//    std::string bytesToHex(std::vector<unsigned char> bytes)
//    {
//        std::string res;
//        for(unsigned int i = 0; i < bytes.size(); i++ ){
//        string hex = intToHexString(bytes[i] & 0xFF);
//        if(hex.length() < 2){
//            res.append("0");
//        }
//        res.append(hex);
//    }
//        return res;
//    }


}
