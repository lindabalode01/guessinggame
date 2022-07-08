import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //theese are two classes we need for this game
        Scanner scann = new Scanner(System.in);
        Random number = new Random();

        // computer will choose a random number up to 100
        int computer = number.nextInt(100);

        //while loop continues till the player guesses the random number chosen by the computer
        while (true) {
            System.out.println("Let's play a guesing game! Pick a number between 0 - 100!");
            int player = scann.nextInt();

            if (player == computer) {
                System.out.println("Woohoo! You won!");
                break;
            } else if (computer > player) {
                System.out.println("Guess again! I will give You a hint - the number is higher!");
            } else {
                System.out.println("Guess again! I will give You a hint - the number is lower!");
            }
        }



    }
}