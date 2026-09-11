import java.util.Scanner;
public class math {
    static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        //hypotenuse for triangle
        //area for a circle
        //volume of a sphere

        double radius;
        double a,b,c;

        System.out.println("Enter any size for A :");
        a= scanner.nextDouble();
        System.out.println("Enter any size for B :");
        b= scanner.nextDouble();
        System.out.println("Enter any radius size :");
        radius= scanner.nextDouble();

        c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("The hypotenuse of triangle is " +c);

        double area =Math.PI*Math.pow(radius,2);
        System.out.println("The area of circle is " +area+ "cm²");

        double volume=(4.0/3.0)*Math.PI*Math.pow(radius,2);
        System.out.println("The volume of sphere is " +volume+ "cm³");




        scanner.close();
    }
}
