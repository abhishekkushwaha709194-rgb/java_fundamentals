import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;
public class random {
    static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Random random =new Random();

        int num1 = random.nextInt(1,99);
        int num2;

        System.out.println("Enter your guessed no ");
        num2= scanner.nextInt();

        if (num2==num1){
            System.out.println("congratulation you guessed it right");
        } else if (num2>num1) {
            System.out.println("Your num is bigger than random");
        } else if (num1>num2) {
            System.out.println("Your num is just smaller than random");
        }


        scanner.close();


    }
}
