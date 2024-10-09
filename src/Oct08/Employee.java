package Oct08;

public class Employee {
    public static void test(){
        System.out.println("This is a test Method");
    }

    static {
        System.out.println("Static Block");
    }

    Employee(){
        System.out.println("Constructor");
    }

    {
        System.out.println("Instance blOCK");
    }

    public void myMethod(){
        System.out.println("non static method");
    }

    static {
        System.out.println("Second static");
    }

    public static void main(String[] args) {
        Employee employee =new Employee();
        Employee.test();
    }
}
