package Oct05;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("");
        Addition add = new Addition();
        Subtraction sub= new Subtraction();
        Multiply mul = new Multiply();
        Divide div = new Divide();
        int y=0;
        do{
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("0. Exit");
            System.out.println("Select any option");
            Scanner sc = new Scanner(System.in);
            y = sc.nextInt();
            if (y == 1) {
                System.out.println("Enter 2 to add two numbers or any key to add 3");
                int num=sc.nextInt();
                if(num==2){
                    System.out.println("Enter First Number");
                    int first = sc.nextInt();
                    System.out.println("Enter Second Number");
                    int second = sc.nextInt();
                    int result = add.add(first,second);
                    System.out.println(result);
                }
                else {
                    System.out.println("Enter First Number");
                    int first = sc.nextInt();
                    System.out.println("Enter Second Number");
                    int second = sc.nextInt();
                    System.out.println("Enter Third Number");
                    int third = sc.nextInt();
                    int result = add.add(first,second,third);
                    System.out.println(result);
                }
            } else if (y == 2) {
                System.out.println("Enter 2 to sub two numbers or any key to sub 3");
                int num=sc.nextInt();
                if(num==2){
                    System.out.println("Enter First Number");
                    int first = sc.nextInt();
                    System.out.println("Enter Second Number");
                    int second = sc.nextInt();
                    int result = sub.sub(first, second);
                    System.out.println(result);
                }
                else {
                    System.out.println("Enter First Number");
                    int first = sc.nextInt();
                    System.out.println("Enter Second Number");
                    int second = sc.nextInt();
                    System.out.println("Enter Third Number");
                    int third = sc.nextInt();
                    int result = sub.sub(first,second,third);
                    System.out.println(result);
                }
            } else if (y == 3) {

                System.out.println("Enter 2 to mul two numbers or any key to multiply 3");
                int num=sc.nextInt();
                if(num==2){
                    System.out.println("Enter First Number");
                    int first = sc.nextInt();
                    System.out.println("Enter Second Number");
                    int second = sc.nextInt();
                    int result = mul.mul(first, second);
                    System.out.println(result);
                }
                else {
                    System.out.println("Enter First Number");
                    int first = sc.nextInt();
                    System.out.println("Enter Second Number");
                    int second = sc.nextInt();
                    System.out.println("Enter Third Number");
                    int third = sc.nextInt();
                    int result = mul.mul(first,second,third);
                    System.out.println(result);
                }
            } else if (y == 4) {
                System.out.println("Enter 2 to divide two numbers or any key to divide 3");
                int num=sc.nextInt();
                if(num==2){
                    System.out.println("Enter First Number");
                    int first = sc.nextInt();
                    System.out.println("Enter Second Number");
                    int second = sc.nextInt();
                    int result = div.div(first, second);
                    System.out.println(result);
                }
                else {
                    System.out.println("Enter First Number");
                    int first = sc.nextInt();
                    System.out.println("Enter Second Number");
                    int second = sc.nextInt();
                    System.out.println("Enter Third Number");
                    int third = sc.nextInt();
                    int result = div.div(first,second,third);
                    System.out.println(result);
                }
            }
            else {
                System.out.println("Please Enter Valid Option");
            }
        }while (y!=0);


    }
}
