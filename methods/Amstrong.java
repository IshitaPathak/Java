import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();

        System.out.println("the numebr you have entered is "+ n);

        if(isAmstrong(n)){
            System.out.println(n+" is an AMstrong number");
        }else{
            System.out.println(n+ " is not an Amstrong number");
        }
    }
        static boolean isAmstrong(int n){
            int numberOfDigit = String.valueOf(n).length();
            int original=n;
            int sum=0;
            while(n>0){
                int lastdigit=n%10;
                int cube=(int) Math.pow(lastdigit,numberOfDigit);
                sum+=cube;
                n=n/10;
            }
            if(sum==original) return true;
            return false;
    
        

    }
}
