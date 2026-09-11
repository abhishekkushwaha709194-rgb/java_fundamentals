import java.util.Random;
import java.util.Scanner;

public class numberGussingGame {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random =new Random();
        int guess;
        int attempts=0;
        int min=1;
        int max=100;
        int randomNumber=random.nextInt(min,max+1);

        System.out.println("Number Gussing Game ");

        do{
            System.out.println("enter your guess : ");
            guess= scanner.nextInt();
            attempts++;
            if(guess>randomNumber) {
                System.out.println("number too high");
            }
            else if(guess<randomNumber){
                    System.out.println("number too low");
                }
            else{
                System.out.println("correct the number was " +randomNumber);
                System.out.println("the number of attempts " +attempts);
            }


        }while(guess !=randomNumber);

        scanner.close();
    }
}
