import java.util.Scanner;
public class switches {
    public  static void main (String[] args ){
        Scanner scanner =new Scanner(System.in);
        String user;
        System.out.print("Enter any month: ");
        user=scanner.nextLine();

        switch (user){
            case "january"->System.out.print("nothing special here ");
            case "february"->System.out.print("nothing special here ");
            case "march"->System.out.print("nothing special here ");
            case "april"->System.out.print("nothing special here ");
            case "may"->System.out.print("nothing special here ");
            case "june"->System.out.print("nothing special here ");
            case "july"->System.out.print("nothing special here ");
            case "august"->System.out.print("independence day ");
            case "september"->System.out.print("durga puja ");
            case "october"->System.out.print("Chhath ");
            case "november"->System.out.print("weddings  ");
            case "december"->System.out.print("special Christmas ");
            default ->System.out.print("nothing special here ");
        }


        scanner.close();
    }
}
