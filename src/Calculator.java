import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("*************");
        System.out.println("Welcome");
        System.out.println("*************");
        int y;
        do {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Modulus");
            System.out.println("0. Exit");
            System.out.println("Select any option");
            Scanner sc = new Scanner(System.in);
             y = sc.nextInt();
            if (y == 1) {
                System.out.println("Enter First Number");
                int first = sc.nextInt();
                System.out.println("Enter Second Number");
                int second = sc.nextInt();
                System.out.println(first + second);
            } else if (y == 2) {
                System.out.println("Enter First Number");
                int first = sc.nextInt();
                System.out.println("Enter Second Number");
                int second = sc.nextInt();
                System.out.println(first + second);
            } else if (y == 3) {
                System.out.println("Enter First Number");
                int first = sc.nextInt();
                System.out.println("Enter Second Number");
                int second = sc.nextInt();
                System.out.println(first * second);
            } else if (y == 4) {
                System.out.println("Enter First Number");
                int first = sc.nextInt();
                System.out.println("Enter Second Number");
                int second = sc.nextInt();
                System.out.println(first / second);
            } else if (y == 5) {
                System.out.println("Enter First Number");
                int first = sc.nextInt();
                System.out.println("Enter Second Number");
                int second = sc.nextInt();
                System.out.println(first % second);
            }
            else {
                System.out.println("Please Enter Valid Option");
            }
        }while (y!=0);
    }
}
//Scanner ---- class, inside java