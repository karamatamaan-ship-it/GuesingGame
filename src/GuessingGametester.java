import java.util.Random;
import java.util.Scanner;

public class GuessingGametester {

    public static void  main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random rand = new Random();

            boolean found = false;
            int numberofattempts = 0;
            int maximumattempts = 5;
            int target = rand.nextInt(100) + 1;

            System.out.println("Enter a Number between 1-100");

            while (found == false && numberofattempts < maximumattempts) {

            int Userguess = scanner.nextInt();

            if (Userguess >= 1 && Userguess <= 100) {

                numberofattempts++;

                if (Userguess == target) {
                    found = true;
                    System.out.println("Correct! The Number has been Guessed");
                } else if (Userguess > target) {
                    System.out.println("Your guess is too High, Try Again");
                } else if (Userguess < target) {
                    System.out.println("Your guess is too Low, Try Again");
                }
            } else {
                System.out.println("Your Guess was not in range, Enter a number from 1-100");
            }
        }
        if (found == false) {
            
            System.out.println("You Lose! You ran out of attempts");
        }

        }
    }
