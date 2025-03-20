public class test08 {
    //a是父 b c 是子
    static void m(a a1){
        if(a1 instanceof b){
            ((b) a1).b3();
        }
        else ((c)a1).c1();
    }
    public static void main(String[] args) {
       a a=new b();
       m(a);

    }
}
