public class 子类继承父类测试 {
    public static void main(String[] args) {
        子类 son=new 子类();
        //子类继承父类的公共成员变量
        System.out.println(son.member);
        //子类继承父类的公共行为
        System.out.println(son.method());
        //子类继承父类的父类的公共成员变量
        System.out.println(son.memberA);
        //子类继承父类的父类公共行为
        System.out.println(son.methodA());
        //子类和父类相同名时
        son.samename();
        //子类和父类相同名方法名
        son.samemethod();
    }
}
