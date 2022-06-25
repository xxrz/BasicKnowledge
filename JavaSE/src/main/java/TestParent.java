public class TestParent {
    @Override
    public String toString(){
        return "p";
    }



    static class Child extends TestParent {
        @Override
        public String toString(){
            return "c";
        }
    }

    public static void main(String[] args) {
        Child test = new Child();
        test.toString();
    }
}

