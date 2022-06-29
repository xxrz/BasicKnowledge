public class TestString {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = "abc".intern();
        System.out.println(str1==str2); //true
        System.out.println(str1==str3); //true


        String str4 = new String("ab"); // 这里会先根据字面量在常量池中创建一个字符串"ab"，然后再到堆中创建一个字符串"ab"，返回堆中的引用
        String str5 = str1.intern(); // 因为常量池中存在"ab"，所以返回常量池中的引用
        System.out.println(str4==str5); // false

        String str7 = "hello".intern(); // 因为常量池中存在"ab"，所以返回常量池中的引用
        String str6 = new String("hello"); // 这里会先根据字面量在常量池中创建一个字符串"ab"，然后再到堆中创建一个字符串"ab"，返回堆中的引用

        System.out.println(str6==str7); // false
    }
}
