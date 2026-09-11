import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock", "paper", "scissors"};
        String playAgain = "yes";

        do {
            System.out.print("Enter your choice (rock, paper, scissors): ");
            String playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice. Try again!");
                continue;
            }

            String computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (
                    (playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                            (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                            (playerChoice.equals("scissors") && computerChoice.equals("paper"))
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            System.out.print("Do you want to continue (yes/no)? ");
            playAgain = scanner.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
