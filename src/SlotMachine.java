import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] symbols = {"🍒", "🍋", "🍉", "⭐", "🔔", "💎"};
        int balance = 100; // starting balance

        System.out.println("🎰 Welcome to the Slot Machine Game!");
        System.out.println("You start with a balance of $" + balance);

        while (balance > 0) {
            System.out.println("\nEnter your bet amount (or type 'quit' to exit):");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            int bet;
            try {
                bet = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            if (bet <= 0) {
                System.out.println("Bet must be greater than 0.");
                continue;
            }

            if (bet > balance) {
                System.out.println("You don't have enough balance to bet $" + bet);
                continue;
            }

            // Deduct bet
            balance -= bet;

            // Spin reels
            String reel1 = symbols[random.nextInt(symbols.length)];
            String reel2 = symbols[random.nextInt(symbols.length)];
            String reel3 = symbols[random.nextInt(symbols.length)];

            System.out.println("Spinning...");
            System.out.println("[" + reel1 + " | " + reel2 + " | " + reel3 + "]");

            // Check results
            if (reel1.equals(reel2) && reel2.equals(reel3)) {
                int win = bet * 5; // jackpot multiplier
                balance += win;
                System.out.println("🎉 JACKPOT! You won $" + win);
            } else if (reel1.equals(reel2) || reel2.equals(reel3) || reel1.equals(reel3)) {
                int win = bet * 2; // small win multiplier
                balance += win;
                System.out.println("✨ Nice! You won $" + win);
            } else {
                System.out.println("😢 No match. You lost your bet.");
            }

            System.out.println("Your balance: $" + balance);
        }

        System.out.println("\nGame over! Final balance: $" + balance);
        scanner.close();
    }
}
