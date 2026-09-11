import java.util.Scanner;

public class array2 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        char[][] telepad=new char[4][3];
        for (int i=0;i< telepad.length;i++){
            for (int j=0;j< telepad[i].length;j++){
                System.out.print("enter elements for telepad ["+i+"] ["+j+"] ");
                telepad[i][j]=scanner.next().charAt(0);
            }
        }
        for (char[] chars : telepad) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }

        scanner.close();
    }
}
