public class test09 {
    public static void para(b b1) {
        b1.b3();


    }

    public static b returnpara() {
        return new b() {//b相当于是父类，整体是新类
            void b3() {
                System.out.println("匿名内部类作为返回参数");
            }
        };


    }

    public static void main(String[] args) {
        new b() {//b相当于是父类，整体是新类
            void b3() {
                System.out.println("匿名内部类直接引用");
            }
        }.b3();
        b b = new b() {//b相当于是父类，整体是新类
            void b3() {
                System.out.println("匿名内部类直接引用多次使用时");
            }
        };
        b.b3();
        b.b3();
        para(new b() {//b相当于是父类，整体是新类
            void b3() {
                System.out.println("匿名内部类作为输入参数");
            }
        });
        returnpara().b3();


    }

}
