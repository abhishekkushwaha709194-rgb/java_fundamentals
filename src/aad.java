import java.util.Scanner;

public class aad {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = s.nextLine();
        System.out.println("Hello " + name);

        System.out.print("Enter number between 10-20: ");
        int num = s.nextInt();

        if (num >= 10 && num <= 15) {
            String[] word = new String[4];
            for (int i = 0; i < word.length; i++) {
                System.out.print("Enter word " + (i+1) + ": ");
                word[i] = s.next();
            }
            String result = String.join(" ", word);
            System.out.println(result);

        } else if (num >= 16 && num <= 20) {
            System.out.print("Enter a number: ");
            int n = s.nextInt();
            int subtract = num - n;
            System.out.println("Result: " + subtract);

        } else {
            System.out.println("You didn't enter a number between 10-20");
        }

        s.close();
    }
}
