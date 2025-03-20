import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import  java.util.Date;

public class test10 {
    public static void main(String[] args) throws ParseException {
        Date date =new Date();
        System.out.println(date);//Thu Mar 20 21:16:39 CST 2025
        System.out.println(date.getTime());//1742476645479
        date.setTime(1742476645479L);
        Date date1=new Date(1742476645479L);
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
        String dataformat=format.format(date1);
        System.out.println(dataformat);
        Date date2=format.parse(dataformat);
        System.out.println(date2);



    }
}
