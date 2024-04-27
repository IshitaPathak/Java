package opp1;
public class Main1 {
    public static void main(String[] args){
        // store 5 roll no
        // int[] numbers = new int[5];

        // store 5 names
        // String[] names = new String[5];

        // data of 5 students {roll no, name, marks }
        // int[] rno = new int[5];
        // String[] name = new String[5];
        // float[] marks = new float[5];

        // Student kunal;
        // kunal = new Student();
        // you can also do this in onw line
         Student kunal = new Student();
         System.out.println(kunal);
         System.out.println(kunal.rno); 
         System.out.println(kunal.name); 
         System.out.println(kunal.marks);
    }
    // create a class 
    //  for every single studeny
}
class Student{
    int rno;
    String name;
    float marks;

    // we need a way to add the values of the above properties object by object
    // we need one word to access every object
    Student(){
        this.rno=12;
        this.marks=234;
        this.name="Ishita";
    }
}
