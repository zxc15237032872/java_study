public class test04 {
    public static void change(Signal signal){
        switch (signal){
            case RED -> System.out.println(1);
            case GREEN -> System.out.println(2);
            case YELLOW -> System.out.println(3);
            default -> System.out.println(4);
        }
    }
    public static void main(String[] args) {
        change(Signal.YELLOW);

    }
}
