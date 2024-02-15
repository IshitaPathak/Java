import java.util.Scanner;
public class TypeCasting{
    public static void main(String[] srgs){
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);

        //   type casting
        int num1=(int)(32.453f);
        System.out.println(num1);

        //  automatic type promotion in expression
        int a=323;
        byte b=(byte)(a);   // 323%256
        System.out.println(b);
    }
}