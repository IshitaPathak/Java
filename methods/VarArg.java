import java.util.Arrays;

public class VarArg {
    public static void main(String[] args) {
        // fun(2, 3, 4, 5, 3, 2, 4, 5);
        multiple(0, 0, "Ishita","Pathak");
    }
   // variable length argument always at the end
    static void multiple(int a,int b,String ...v){
          System.out.println(a+" "+ b + " "+Arrays.toString(v));
    }
     // variable length arguments
    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
