import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp;
        double newtemp;
        String choice;

        System.out.println("Enter C to convert Celsius to Fahrenheit");
        System.out.println("Enter F to convert Fahrenheit to Celsius");
        System.out.print("Enter your choice: ");
        choice = scanner.next().toUpperCase();

        System.out.print("Enter temperature: ");
        temp = scanner.nextDouble();

        // Correct formulas with ternary operator
        newtemp = (choice.equals("C"))
                ? ((temp * 9.0 / 5.0) + 32)   // Celsius → Fahrenheit
                : ((temp - 32) * 5.0 / 9.0); // Fahrenheit → Celsius

        System.out.printf("Result: %.2f%n", newtemp);

        scanner.close();
    }
}
