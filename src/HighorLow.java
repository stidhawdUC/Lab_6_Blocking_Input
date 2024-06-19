import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        String trash = "";

        int rndNum = gen.nextInt(10) + 1;
        int userGuess = 0;
        boolean done = false;
        System.out.print("The system is choosing a random number from 1 to 10.\n" +
                "Guess the number: ");
        do{
            if(in.hasNextInt()){
                userGuess = in.nextInt();
                in.nextLine();
                if(userGuess >= 1 && userGuess <= 10)
                    done = true;
                else System.out.print("Please enter a guess from 1 to 10, not " + userGuess + ".\nTry again: ");
            }
            else {
                trash = in.nextLine();
                System.out.print("You must enter a val" +
                        "id guess from 1 to 10, not " + trash + ".\nTry again: ");
            }
        }while (!done);
        System.out.println("You answered " + userGuess + ".");

        if(userGuess > rndNum) {
            System.out.println("Your guess was greater than the randomly" +
                    " selected number, which was " + rndNum + ".");
        }
        else if(userGuess == rndNum) {
            System.out.println("Right on the money! The randomly selected number was " + rndNum + ".");
        }
        else System.out.println("Your guess was lesser than the randomly selected number," +
                    " which was " + rndNum + ".");


    }
}