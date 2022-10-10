import sun.nio.ch.DirectBuffer;

import java.nio.ByteBuffer;

public class TestDirect {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(1024);
        byteBuffer.putInt(1);
        System.out.println(byteBuffer.getInt(0));
        System.gc();
    }
}
