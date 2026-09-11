import java.util.Scanner;

public class compoundIntrest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double principal;
        double time;
        double annualRate;
        double compoundingFrequency;
        double monthlyContribution;
        double afterCompound;

        System.out.print("Enter principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter time (years): ");
        time = scanner.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        annualRate = scanner.nextDouble() / 100;

        System.out.print("Enter compounding frequency per year: ");
        compoundingFrequency = scanner.nextDouble();

        System.out.print("Enter monthly contribution: ");
        monthlyContribution = scanner.nextDouble();

        afterCompound =
                principal * Math.pow(1 + annualRate / compoundingFrequency,
                        compoundingFrequency * time)
                        + monthlyContribution *
                        ((Math.pow(1 + annualRate / compoundingFrequency,
                                compoundingFrequency * time) - 1)
                                / (annualRate / compoundingFrequency));

        System.out.printf("Amount after %.1f years = %.2f%n",
                time, afterCompound);

        scanner.close();
    }
}