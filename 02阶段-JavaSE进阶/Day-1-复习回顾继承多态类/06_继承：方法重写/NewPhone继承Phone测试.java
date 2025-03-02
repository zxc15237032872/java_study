public class NewPhone继承Phone测试 {
    public static void main(String[] args) {
        NewPhone newPhone=new NewPhone();
        System.out.println("重写的：");
        newPhone.call();
        System.out.println("没重写的：");
        newPhone.sendMessage();
        //根据运行结果得目前重写没影响

    }
}
