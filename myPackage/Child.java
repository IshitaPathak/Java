package myPackage;

// Subclass
public class Child extends Parent {
    void accessParent() {
        // Accessing all types of fields and methods of superclass
        System.out.println(publicField);
        System.out.println(protectedField);
        System.out.println(packagePrivateField);
        // Private fields and methods are not accessible in subclasses
        // System.out.println(privateField); // Error: privateField has private access in Parent
         publicMethod();
         protectedMethod(); 
         packagePrivateMethod();
        //  privateMethod(); // Error: privateMethod() has private access in Parent      
    }
}