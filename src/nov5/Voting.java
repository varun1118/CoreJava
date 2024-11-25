package nov5;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        System.out.println("Please Enter your age");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        try{

        if(x>=18){
            System.out.println("Go for voting");
        }
        else {
            throw new InvalidAgeException("Age is not valid");
        }
    } catch (InvalidAgeException e) {
            e.printStackTrace();
        }
        }
}
