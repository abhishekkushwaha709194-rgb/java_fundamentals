import java.util.Scanner;
public class CalculatorSWITCH {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        String operator;

        System.out.print("Enter any operator {+,-,*,/,%}:  ");
        operator=scanner.nextLine();
        System.out.print("Enter num1: ");
        double num1= scanner.nextDouble();
        System.out.print("Enter num2: ");
        double num2= scanner.nextDouble();

        switch (operator){
            case "+":
                double add=num1+num2;
                System.out.println(add);
                break;
            case "-":
                double subtract=num1-num2;
                System.out.println(subtract);
                break;
            case "*":
                double multiply=num1*num2;
                System.out.println(multiply);
                break;
            case "/":
                double divide=num1/num2;
                System.out.println(divide);
                break;
            case "%":
                double modules =num1%num2;
                System.out.println(modules);
                break;
            default:
                System.out.println("that's not even valid");

        }


        scanner.close();
    }
}
