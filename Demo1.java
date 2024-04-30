public class Demo1 {
    // Static variable
    static int count = 0;

    // Constructor
    public Demo1() {
        // Increment count each time a new instance is created
        count++;
    }

    public static void main(String[] args) {
        // Create instances of the class
        Demo1 obj1 = new Demo1();
        Demo1 obj2 = new Demo1();
        Demo1 obj3 = new Demo1();

        // Print the value of the static variable
        System.out.println(count);
    }
}
