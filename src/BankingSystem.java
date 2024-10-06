import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to the bank");
        System.out.println("Set a pin of 4 numbers");
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();
        boolean first_time = true;
        int balance =0;
        do{
            if( first_time){
                System.out.println("Please choose an option");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                int choice = sc.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("Your Current Balance is: "+balance);
                        break;
                    case 2:
                        int check = 0;
                        do {
                            System.out.println("Enter the amount you want to deposit");
                            if (sc.hasNextInt()) {
                                int amount = sc.nextInt();
                                balance = balance + amount;
                                check = 0;
                            } else {
                                System.out.println("Invalid input. Please enter an integer.");
                                sc.next(); // Consume the invalid input
                                check = 1;
                            }
                        } while (check != 0);
                        break;
                    case 3:
                        System.out.println("Enter the amount you want to withdraw");
                        int amount = sc.nextInt();
                        int y = balance - amount;
                        if(y>=0){
                            balance =y;
                        }
                        else {
                            System.out.println("You do not have enough money");
                        }
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Please enter a valid option");
                }
            }

        }while (true);
    }
}
