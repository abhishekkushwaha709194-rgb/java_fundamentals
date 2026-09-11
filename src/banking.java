import java.util.Scanner;

public class banking {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0;
        int choice;
        boolean isRunning = true;

        while (isRunning) {

            System.out.println("\n1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance = withdraw(balance);
                case 4 -> {
                    exit();
                    isRunning = false;
                }
                default -> System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.printf("Balance: %.2f%n", balance);
    }

    static double deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount can't be negative.");
            return 0;
        }

        return amount;
    }

    static double withdraw(double balance) {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount can't be negative.");
            return balance;
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
            return balance;
        }

        return balance - amount;
    }

    static void exit() {
        System.out.println("Thank you. Have a good day!");
    }
}