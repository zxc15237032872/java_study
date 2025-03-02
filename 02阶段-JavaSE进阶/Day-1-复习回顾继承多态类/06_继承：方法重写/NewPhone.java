public class NewPhone extends Phone {
    @Override //检查父类中是否有要重写的方法存在【检查语法】
    public void call(){
        super.call();
        System.out.println("新手机打电话");
    }
    public void sendMessage(){
        super.sendMessage();
        System.out.println("新手机发消息");
    }


}
