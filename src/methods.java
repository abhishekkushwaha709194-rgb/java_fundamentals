import java.util.Scanner;
public class methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr=new int[5];

        for (int i=0; i< arr.length;i++){
            System.out.print("Enter elements ");
            arr[i]= scanner.nextInt();
        }
        maxMin(arr);


        scanner.close();
    }

    static int countVowel(String str) {

        str = str.toLowerCase();

        int vowel = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            }
        }

        return vowel;
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;

        }
        return fact;
    }

    static int gcd(int a, int b) {
        int limit = Math.min(a, b);
        int gcd = 1;
        for (int i = 1; i <= limit; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    static void fibonacci(int num) {
        int first = 0;
        int second = 1;

        if (num >= 1) {
            System.out.print(first + " ");

            if (num >= 2) {
                System.out.print(second + " ");
            }

            for (int i = 3; i <= num; i++) {
                int next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
        }
    }

    static void removeDuplicates(int[] arr){
        for (int i=0;i< arr.length;i++){
            int current=arr[i];
            boolean alreadyPrinted=false;
            for (int j=0;j<i;j++){
                if (arr[j]==current){
                    alreadyPrinted=true;
                    break;
                }

            }
            if (!alreadyPrinted){
                System.out.println(current);
            }
        }

    }

    static void maxMin(int[] arr){
        int maximun=arr[0];
        int minimun=arr[0];
        int i=0;
        while (i< arr.length) {

            if (maximun<arr[i]) {
                maximun = arr[i];
            }if (minimun>arr[i]){
                 minimun=arr[i];
                }

            i++;
        }
        System.out.println("maximum" + maximun);
        System.out.println("minimum" + minimun);
    }

    static boolean isArmstrong(int n) {
            if (n < 0) {
                return false;
            }

            int original = n;
            int digits = String.valueOf(n).length();
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                int power = 1;
                for (int i = 0; i < digits; i++) {
                    power *= digit;
                }
                sum += power;
                n /= 10;
            }

            return sum == original;
        }


}