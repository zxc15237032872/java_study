import java.util.Calendar;
import java.util.Date;

public class test11 {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();//创建对象
        System.out.println(c);
        System.out.println(c.get(Calendar.YEAR));
        c.set(Calendar.YEAR,2022);
        System.out.println(c.get(Calendar.YEAR));
        c.set(2022, Calendar.DECEMBER,1);
        System.out.println(c);
        c.add(Calendar.YEAR,1);//正为加
        System.out.println(c);
        c.add(Calendar.MONTH,-2);//负为减
    }
}
