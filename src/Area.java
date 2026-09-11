import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Rectangle area

        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double breadth = scanner.nextDouble();

        double area = width * breadth;

        System.out.printf("The area of rectangle is %.2f%n", area);

        scanner.close();
    }
}