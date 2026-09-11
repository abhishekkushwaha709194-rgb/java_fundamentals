import  java.util.Scanner;
public class test {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        String Name;
        int age;
        double price;
        char firstLetter;
        boolean isStudent;

        System.out.println("Enter you name :");
        Name= scanner.nextLine();

        System.out.println("Enter your age :");
        age= scanner.nextInt();
        System.out.println("Enter first letter of your name :");
        firstLetter=scanner.next().charAt(0);
        System.out.println("Enter the price for a pen :");
        price= scanner.nextDouble();
        System.out.println("Are you a student :");
        isStudent= scanner.nextBoolean();


        if (Name.isEmpty()){
            System.out.println("You didnt enter your name ");
        }else {
            System.out.println("your name is " +Name);
        }
        System.out.println("Your age is " +age);
        System.out.println("The first letter of your name is " +firstLetter);
        System.out.println("The pen  price is " +price);

        if (isStudent){
            System.out.println("oh so you are a student ");
        }
        else {
            System.out.println("You are not a student ");
        }

        scanner.close();
    }
}
