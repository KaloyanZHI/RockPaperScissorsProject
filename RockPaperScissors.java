import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String ROCK = "Rock";
        final String PAPER = "Paper";
        final String SCISSORS = "Scissors";
        System.out.println("Choose [r]ock, [p]aper or [s]cissors!");

        String playerMove = scanner.nextLine();

        if (playerMove.equals("r") || playerMove.equals("rock")) {
            playerMove = ROCK;
        } else if (playerMove.equals("p") || playerMove.equals("paper")) {
            playerMove = PAPER;
        } else if (playerMove.equals("s") || playerMove.equals("scissors")) {
            playerMove = SCISSORS;
        } else {
            System.out.println("Invalid move! Please try again...");
            return;
        }
        String computerMove = "";
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if (randomNumber == 0) {
            computerMove = ROCK;
            System.out.println("The computer chose Rock.");
        } else if (randomNumber == 1) {
            computerMove = PAPER;
            System.out.println("The computer chose Paper.");
        } else if (randomNumber == 2) {
            computerMove = SCISSORS;
            System.out.println("The computer chose Scissors.");
        }
        if (playerMove.equals(computerMove)) {
            System.out.println("The game was a draw!");
        } else if ((playerMove.equals(ROCK) && computerMove.equals(SCISSORS))
                || (playerMove.equals(PAPER) && computerMove.equals(ROCK))
                || (playerMove.equals(SCISSORS) && computerMove.equals(PAPER))) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose! Try again!");
        }

    }
}




