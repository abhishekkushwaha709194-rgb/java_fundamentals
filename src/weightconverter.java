import java.util.Scanner;
public class weightconverter {
    static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("weight converter program ");
        System.out.println("enter 1 for converting kgs to lbs: ");
        System.out.println("enter 2 for converting lbs to kgs: ");
        System.out.println("enter your choice: ");
        int choice= scanner.nextInt();

        if (choice == 1){
            System.out.print("Enter in kgs : ");
            double weight= scanner.nextDouble();
            double newWeight=weight*2.20462;
            System.out.printf("After converting %.3f",newWeight);
        } else if (choice == 2) {
            System.out.println("Enter in lbs: ");
            double weight= scanner.nextDouble();
            double newWeight=weight*0.453592;
            System.out.printf("After converting %.3f",newWeight);

        }

        scanner.close();
    }
}
