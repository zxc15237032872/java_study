public class test06 {
    public static void main(String[] args) {
        new bufferfly(){


            @Override
            public void fly() {
                System.out.println(1);
            }
        }.fly();
    }
}
