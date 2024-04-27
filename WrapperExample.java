
public class WrapperExample{
    public static void main(String[] args){
        // int a=10;
        // int b=20;
        Integer a=10;
        Integer b=20;
        swap(a,b);
        // System.out.println(a+" "+b);
    }
    static void swap(Integer a,Integer b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
}
 // It still dont swap because its 
//  if we do with int its primitive and stored in stack memory 
// Integer contains final 