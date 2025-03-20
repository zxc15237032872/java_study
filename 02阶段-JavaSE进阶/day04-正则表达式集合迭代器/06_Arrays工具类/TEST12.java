import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class TEST12 {
    public static void main(String[] args) {
        int[] arrays=new int[10];
        Random r=new Random();
        for (int i = 0; i < 10; i++) {
            int a=r.nextInt(101);
            arrays[i]=a;
        }
        System.out.println(Arrays.toString(arrays));
        String str=Arrays.toString(arrays);
        System.out.println(str);
        str=str.substring(1,str.length()-1);
        System.out.println(str);
        str=str.replace(",","");
        System.out.println(str);
        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));

    }
}
