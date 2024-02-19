import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(true){
            // take input as a operator
            System.out.println("enter the operator");
            char op=in.next().trim().charAt(0);
            if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
                // input two numbers
                System.out.println("enter the two numbers");
                int num1=in.nextInt();
                int num2=in.nextInt();

                 if (op == '+') {
                System.out.println("Result: " + (num1 + num2));
            } else if (op == '-') {
                System.out.println("Result: " + (num1 - num2));
            } else if (op == '/') {
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero");
                }
            } else if (op == '*') {
                System.out.println("Result: " + (num1 * num2));
            } else if (op == '%') {
                System.out.println("Result: " + (num1 % num2));
            } 
    
            }else {
                System.out.println("Invalid Operation");
                break; // Move the break statement here
            }
        }
    }
}