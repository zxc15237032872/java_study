public class Student extends People {
    public Student(String name, int age) {
        super(name, age);
    }
    //下面的也行
//    public Student() {
//        super("xx",23);
//    }
    public Student(){
        //隐藏代码 super();
    }


}
