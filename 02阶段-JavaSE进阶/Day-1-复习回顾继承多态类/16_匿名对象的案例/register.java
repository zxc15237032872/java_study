import java.util.ArrayList;
import java.util.Scanner;

public class register {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("用户名：");
        String name = sc.nextLine();
        System.out.println("手机号：");
        String password;
        String confirm;
        String phoneNumber = sc.nextLine();
        while (true) {
            System.out.println("密码：");
            password = sc.nextLine();
            System.out.println("确认密码：");
            confirm = sc.nextLine();
            //判断登录密码和确认密码是否一致
            if (password.equals(confirm)) {
                break;

            } else {
                System.out.println("重新输入，密码不一样");
            }

        }


        System.out.println("电子邮箱：");
        String email = sc.nextLine();
        System.out.println("性别：");
        String sex = sc.nextLine();
        System.out.println("出生日期：");
        String birthday = sc.nextLine();
        ArrayList<User> userArrayList = new ArrayList<>();
        userArrayList.add(new User(name, phoneNumber, password, confirm, email, sex, birthday));
        for (User user : userArrayList) {
            System.out.print(user.getName()+",");
            System.out.print(user.getPhoneNumber()+",");
            System.out.print(user.getPassword()+",");
            System.out.print(user.getConfirm()+",");
            System.out.print(user.getEmail()+",");
            System.out.print(user.getSex()+",");
            System.out.print(user.getBirthday()+"/n");


        }

    }
}
