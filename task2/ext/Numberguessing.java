package ext;

import java.util.Random;
import java.util.Scanner;

public class Numberguessing {
    public static void main(String args[]) {
        Random rand = new Random();
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int randomnumber = rand.nextInt(100) + 1;

        @SuppressWarnings("unused")
        int numberOfTries = 1;

        boolean win = false;
        while (win == false) {

            System.out.println("enter your guess(1-100):");
            int playerguess = sc.nextInt();

            if (playerguess == randomnumber) {

                System.out.println("correct! you win ");

                break;

            } else if (playerguess > randomnumber) {
                System.out.println("nope! Number is higher...Guess again");
            } else if (playerguess < randomnumber)
                System.out.println("nope! Number is lesser....guess again");
        }
    }

}
