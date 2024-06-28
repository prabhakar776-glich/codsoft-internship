import java.util.*;

public class numbergame {
    public static void main(String[] args) {
        int no_to_guess, no_of_tries = 0, guess, score = 0;
        boolean win = false;
        boolean choice = true;

        // Create a random object
        Random random_no = new Random();

        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Generation of random number between 1 and 100
        no_to_guess = random_no.nextInt(100) + 1;

        System.out.println("!!!!!!!!!  Welcome to number guessing game  !!!!!!!!!");
        System.out.println("*****************************************************");
        System.out.println("!!!! I have selected a number between 1 and 100 !!!!");
        System.out.println("!!! Try to guess it there is five chance to guess !!! ");

        // Game loop
        while (choice) {
            while (no_of_tries != 5 && !win) {
                System.out.print("Enter your guess:- ");
                guess = sc.nextInt();
                no_of_tries++;

                if (guess < 1 || guess > 100) {
                    System.out.println("Please Enter the number between 1 and 100!");
                } else if (guess > no_to_guess) {
                    System.out.println("Your guess is greater than the number!");
                } else if (guess < no_to_guess) {
                    System.out.println("Your guess is lesser than the number!");
                } else {
                    win = true;
                    score = 100;
                    System.out.println("Congratulations! You have won the game!");
                    System.out.println("Number of tries = " + no_of_tries + " Your score is = " + score);
                }
            }
            if (!win) {
                System.out.println("You lose the game!");
                System.out.println("The number to be guessed was:- " + no_to_guess);
                System.out.println("Your Score is:- 0");
            }

            System.out.print("Enter true to play again! :");
            choice = Boolean.parseBoolean(sc.next()); // Read user input as String and parse it to boolean

            // Reset variables for a new game
            no_of_tries = 0;
            win = false;
            no_to_guess = random_no.nextInt(100) + 1;
        }

        // Close the scanner
        sc.close();
    }
}
