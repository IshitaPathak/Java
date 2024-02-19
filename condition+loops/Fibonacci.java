
import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int b=1;
        int count =0;
        if(n==1) System.out.println(a);
        else if(n==2) System.out.println(b);
        else{
        for(int i=3;i<=n;i++){
             count=a+b;
             a=b;
             b=count;
        }
         System.out.println(count);
        }
    }
}