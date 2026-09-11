import java.util.Scanner;
public class code{
    public static void main(String[] args ){
        Scanner scanner =new Scanner(System.in);


        System.out.print("enter your name :");
        String name =scanner.nextLine();
        System.out.print("enter your age :");
        int age =scanner.nextInt();
        System.out.print("enter your gpa :");
        double gpa =scanner.nextDouble();
        System.out.print("enter your grade :");
        char grade=scanner.next().charAt(0);
        System.out.print("are you a student (true/false) :");
        boolean isStudent =scanner.nextBoolean();

        if (isStudent) {
            System.out.println("you are student");
        }else {
            System.out.println("you are not student");
        }

        System.out.println("your name is "+name);
        System.out.println("your age is "+age);
        System.out.println("your gpa is "+gpa);
        System.out.println("your grade is "+grade);

        scanner.close();



    }
}