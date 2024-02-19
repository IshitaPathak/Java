import java.util.Scanner;

public class Prime {
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      System.out.println(isPrime(n));
   }    
    static boolean isPrime(int n){
        // if(n<=1) return false;
        // int c=2;
        // while(c*c<=n){
        //     if(n%c==0){
        //         return false;
        //     }
        //     c++;
        // }

        // return c*c>n;
        if(n==1) return false;
        for (int i = 2; i*i <=n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
