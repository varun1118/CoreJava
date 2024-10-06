import java.util.Scanner;

public class Casino {
    public static void main(String[] args) {
        int play=0;
    do{
        System.out.println("Enter your choice");
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int win =0;
        for (int i = 0; i < 2; i++) {
            if(x == 22){
                System.out.println("Congratulations! You Win");
                win =1;
                break;
            }
            else{
                System.out.println("You loose "+(i+1)+ " attempt");
                System.out.println("Enter your choice");
                x= sc.nextInt();
            }
        }
        if(win ==0){
            System.out.println("Sorry you loose all your attempts");
        }
        System.out.println("Press 1 to play again");
        play = sc.nextInt();
    }while (play ==1);



    }
}
