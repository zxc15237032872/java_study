public class 子类 extends 父类{
    //子类可以使用父类的公共成员和方法
    public int member1;
    public String samename="子类中的成员变量";
    public int member2;
    public int method1(){
        return 2;
    }
    //就近原则，找变量名
    public void samename(){
        String samename="方法中的局部变量";
        System.out.println(samename);
        System.out.println(this.samename);
        System.out.println(super.samename);
    }
    public void samename1(){
        System.out.println(samename);
        System.out.println(this.samename);
        System.out.println(super.samename);
    }
    public void samemethodname(){
        System.out.println("这是子类方法");
    }
    public void samemethod(){
        this.samemethodname();
        super.samemethodname();
    }


}