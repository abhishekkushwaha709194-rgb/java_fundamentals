public class printf {
    static void main(String[] args) {
        String name="Abhishek kushwaha";
        int age =20;
        double height=5.10;
        char First='A';
        boolean isStudent =true;
        double Pi=Math.PI;
        int a = 5;
        int b =8;
        int c =a*b;
        System.out.printf("Your name is %s \n",name);
        System.out.printf("your age is %d \n",age);
        System.out.printf("your height is %.2f \n",height);
        System.out.printf("the letter is %c \n ",First);
        System.out.printf("You are a student that is %b \n",isStudent);
        System.out.printf("The value of pi is %.2f \n",Pi);
        System.out.printf("the field width %5d \n ",age);
        System.out.printf("the zero padding %04d\n ",age);
        System.out.printf("the right justified %6d\n ",age);
        System.out.printf("the left justified %-5d\n ",age);
        System.out.printf("the multiply of two num is %d\n",c);
        System.out.printf("my name is %s and age is %d and height is %.2f ",name,age,height);

    }
}
