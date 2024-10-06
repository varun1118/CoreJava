import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int p = 1;
        do{
            p=p*x;
            x--;
        }while (x>=1);
        System.out.println(p);
    }
}
