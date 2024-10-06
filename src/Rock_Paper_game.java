import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_game {
    public static void main(String[] args) {
        int player=0;
        int computer=0;
        int pc = 0;
        do {
            System.out.println("Choose Rock, Paper or Scissor");
            Scanner sc = new Scanner(System.in);
            String choice = sc.next().toLowerCase();
            if (choice.equals("rock") || choice.equals("paper") || choice.equals("scissor")) {
                String options[] = {"rock", "paper", "scissor"};
                Random rand = new Random();
                int random = rand.nextInt(options.length);
                String result = options[random];
                System.out.println(result);
                if (result.equals(choice)) {

                    System.out.println("You win");
                    System.out.println(" Press 1 if you want to play and 2 to exit");
                    pc = sc.nextInt();
                    player++;
                } else {
                    System.out.println("You Loose");
                    System.out.println(" Press 1 if you want to play and 2 to exit");
                    pc = sc.nextInt();
                    computer++;
                }
            } else {
                System.out.println("Please type valid input");
            }
        } while (pc == 1);
        System.out.println("Computer win times "+computer);
        System.out.println("Player win times "+player);
    }
}
