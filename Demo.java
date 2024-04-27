import java.util.*;

class Employee {
    int empno;
    String empname;

    Employee(int empno, String empname) {
        this.empno = empno;
        this.empname = empname;
    }
}

public class Demo {
    public static void main(String[] args) {
        Employee[] emp = new Employee[3];

        // Create 3 objects of Employee
        emp[0] = new Employee(1, "John");
        emp[1] = new Employee(2, "Mary");
        emp[2] = new Employee(3, "Bob");

        // Call addemployee() method to add employees to the array
        addemployee(emp);

        // Call showemployee() method to display details of employees
        showemployee(emp);
    }

    // addemployee() method to add employees to the array
    public static void addemployee(Employee[] emp) {
        for (int i = 0; i < emp.length; i++) {
            System.out.println("Enter employee number: ");
            emp[i].empno = Integer.parseInt(System.console().readLine());

            System.out.println("Enter employee name: ");
            emp[i].empname = System.console().readLine();
        }
    }

    // showemployee() method to display details of employees
    public static void showemployee(Employee[] emp) {
        for (int i = 0; i < emp.length; i++) {
            System.out.println("Employee number: " + emp[i].empno);
            System.out.println("Employee name: " + emp[i].empname);
        }
    }
}