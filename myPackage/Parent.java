package myPackage;

// Superclass
public class Parent {
    public String publicField = "Accessible everywhere";
    protected String protectedField = "Accessible within package and subclasses";
    String packagePrivateField = "Accessible within the package only";
    private String privateField = "Accessible only within this class";

    public void publicMethod() {
        System.out.println("Public method");
    }
    protected void protectedMethod() {
        System.out.println("Protected method");
    }
    void packagePrivateMethod() {
        System.out.println("Package-private method");
    }
    private void privateMethod() {
        System.out.println("Private method");
    }
}


// Non-subclass
class OtherClass {
    void accessParent() {
        Parent parent = new Parent();
        System.out.println(parent.publicField);
        System.out.println(parent.protectedField); 
        System.out.println(parent.packagePrivateField);
        // Private fields and methods are not accessible in non-subclasses
        // System.out.println(parent.privateField); // Error: privateField has private access in Parent
        parent.publicMethod();
        parent.protectedMethod(); 
        parent.packagePrivateMethod();
        // parent.privateMethod(); // Error: privateMethod() has private access in Parent      
    }
}

 