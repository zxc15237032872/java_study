public class test07 {
    public static void main(String[] args) {
        //a是父
        //b是子
        a a=new b();//主要是为了输入的的参数类型一致，以后再强转回去
        System.out.println(a.a1);
        System.out.println(a.a2);
        a.a3();
        //向上转型，b只带了存储空间，里面的成员没带
        //a是父
        //b是子
        b b=((b)a);//父类如果由子类new成，则可以强转
        System.out.println(b.a1);
        System.out.println(b.b2);
        b.a3();
        b.b3();
        b b1=new b();
        b1.a3();
        System.out.println(b1.a1);


    }
}
