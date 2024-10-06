import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        int i=0;
        do{
            sum=sum+i;
            i++;
        }while (i<=x);
        System.out.println("Sum is:"+sum);
    }
}
