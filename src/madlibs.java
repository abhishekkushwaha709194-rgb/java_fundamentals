import java.util.Scanner;
public class madlibs {
    static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String adjective1;
        String adjective2;
        String adjective3;
        String noun1;
        String verb1;

        System.out.println("enter adjective ");
        adjective1= scanner.next();
        System.out.println("enter any name ");
        noun1= scanner.next();
        System.out.println("enter an adjective ");
        adjective2= scanner.next();
        System.out.println("enter an action verb ");
        verb1= scanner.next();
        System.out.println("enter an adjective ");
        adjective3= scanner.next();

        System.out.println("today i went to a" + adjective1 + "zoo");
        System.out.println("in a exhibit , i saw " + noun1);
        System.out.println(noun1 + "was " +adjective2+ "and " +verb1+"!");
        System.out.println("i was " +adjective3);

        scanner.close();

    }
}
