import java.util.Scanner;
public class HelloWorld {
    static void main(String[] args) {
        //shopping cart program

        Scanner scanner =new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency='$';

        System.out.print("what do you like to buy (Available items tea ,somosa ,pakoda,hamburger etc)" );
        item= scanner.nextLine();
        System.out.print("the price is for one piece ");
        price=scanner.nextDouble();
        System.out.print("Enter your quantity  :");
        quantity= scanner.nextInt();


        double total;
        total = price*quantity;
        System.out.println("\nyou have bought " +quantity+ " " +item);
        System.out.print("your total bill is "+currency+ " "+total);


        scanner.close();
    }
}