public class test2 {
    public static void dance(Student1 student1) {
        System.out.println(student1.getName() + "正在跳舞");
    }
    public static Student1 createobject(String name,int age){
        return new Student1(name,age);

    }

    public static void main(String[] args) {
        //直接调用成员方法
        new Student1().say();
        // 直接当做方法参数传递
        dance(new Student1("莎莎", 11));
        //直接当做返回值
        Student1 student1=createobject("xixi",12);
        System.out.println("姓名："+student1.getName());
        System.out.println("年龄："+student1.getAge());


    }


}
