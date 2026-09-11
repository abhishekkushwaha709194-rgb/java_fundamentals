import java.util.Scanner;
import java.util.Arrays;
public class array {
    public static void main (String[] args){
        Scanner scanner =new Scanner(System.in);
        String[] fruits={"Apple","Banana","mango"};
        String[] foods=new String[4];
        for (int i=0;i< foods.length;i++){
            System.out.print("enter your fav foods ");
            foods[i]= scanner.nextLine();
        }
        for (String food: foods){
            System.out.println(food);
        }

        for (String fruit :fruits){
            System.out.print(fruit +" ");
        }


        scanner.close();
    }
}
