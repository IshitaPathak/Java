package inherentance;

class A {
    // public static void main(String[] agrs){
    // }
    int n = 10;
}

class B {
    int n = 23;
}

class C1 extends B {
    
}

class C2 extends A {
}

// we cant do this as multiple inherence is not allowed so we use interface
// class C extends B{

// }

// class C extends A{

// }

public class multiple {
    public static void main(String[] args) {
        C1 obj1 = new C1();
        C2 obj2 = new C2();
        System.out.println(obj1.n); // Outputs 23
        System.out.println(obj2.n); // Outputs 10
    }
}


