import java.util.Scanner;

class ReverseNum{
    public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int reverse=0;
          while(n>0){
              int lastNum=n%10;
              reverse=reverse*10+lastNum;
              n=n/10;
          }

          System.out.println(reverse);
    }
}