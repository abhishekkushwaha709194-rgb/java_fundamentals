import java.lang.reflect.Method;
import java.util.Scanner;

public class fundamental {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        //table of a number
       /* int number;
        int len=11;
        System.out.print("Enter your number to print table : ");
        number=scanner.nextInt();

        for (int i=1;i <len;i++){
            System.out.printf("%d\n",number*i);
        }

        //factorial of a number
        int n;
        int fact = 1;

        System.out.print("enter any number for factorial :");
        n= scanner.nextInt();
        for (int i=1;i<n+1;i++) {
            fact=fact*i;
            System.out.println(fact);
        }


        //checking prime number


                int n;
                boolean isPrime = true;

                System.out.print("Enter any number: ");
                n = scanner.nextInt();

                if (n <= 1) {
                    System.out.println("Not a prime number");
                } else {

                    for (int i = 2; i < n; i++) {

                        if (n % i == 0) {
                            isPrime = false;
                            break;
                        }

                    }

                    if (isPrime) {
                        System.out.println(n + " is a prime number");
                    } else {
                        System.out.println(n + " is not a prime number");
                    }
                }


        //Reverse an integer (12345 → 54321).
        int n;
        int sum=0;
        System.out.print("Enter an integer to reverse ");
        n= scanner.nextInt();
        while (n>0){
            int lastDigit=n%10;
            sum =sum*10+lastDigit;
            n/=10;
        }
        System.out.println(sum);

//Count the number of digits in a number.
        int n;
        int sum = 0;
        System.out.print("enter any number to count its digit ");
        n = scanner.nextInt();
        if (n == 0) {
            System.out.println(1);
        }else {
            while (n > 0) {
            n = n / 10;
            sum += 1;
        }
            System.out.println(sum);

        //Find the sum of digits of a number.

        int n;
        int sum=0;
        System.out.print("Enter any digits to finds its sum ");
        n= scanner.nextInt();
        while (n>0) {
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n /= 10;
        }
        System.out.println(sum);

        //palindrome
        int n;
        int sum = 0;
        System.out.print("Enter number to check if it is palindrome  ");
        n = scanner.nextInt();
        int original = n;
        while (n > 0) {
            int lastDigit = n % 10;
            sum = sum * 10 + lastDigit;
            n /= 10;


        if (original == sum) {
            System.out.println("the number is palindrome ");
        } else {
            System.out.println("not a palindrome ");
        }


//Armstrong number

                int n;

                System.out.print("Enter a number: ");
                n = scanner.nextInt();

                int original = n;

                // Count digits
                int digits = 0;
                int temp = n;

                while (temp > 0) {
                    digits++;
                    temp /= 10;
                }

                int arm = 0;

                temp = n;

                while (temp > 0) {
                    int lastDigit = temp % 10;
                    arm += (int) Math.pow(lastDigit, digits);
                    temp /= 10;
                }

                if (arm == original) {
                    System.out.println("Armstrong Number");
                } else {
                    System.out.println("Not an Armstrong Number");
                    }

        //Print all even numbers from 1 to N
        int n;
        System.out.print("Enter range to print even num ");
        n=scanner.nextInt();
        for (int i=1;i<n;i++){
            if (i%2==0){
                System.out.println("the even number between 1 to " +n+ " is " +i);
            }
        }



        //Find the largest of three numbers.
        int[] number = new int[3];

        for (int i = 0; i < number.length; i++) {
            System.out.print("Enter number: ");
            number[i] = scanner.nextInt();
        }

        int largest = number[0];

        for (int i = 1; i < number.length; i++) {
            if (number[i]>largest) {
                largest = number[i];
            }
        }

        System.out.println("Largest = " + largest);



        //Check if a year is a leap year.

        int year;
        System.out.print("Enter any year to check if it's leap year or not ");
        year=scanner.nextInt();
        if (year%4==0 && year%100!=0){
            System.out.println("it's a leap year " +year);
        } else if (year%400==0) {
            System.out.println("it's a leap year " +year);

        }else {
            System.out.println("it's a common year ");
        }


        //*
        //**
        //***
        //****
        //*****
        int row;

        System.out.print("Enter number of rows: ");
        row = scanner.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        //*****
        //****
        //***
        //**
        //*

        int row ;
        System.out.print("enter no of rows");
        row=scanner.nextInt();
        for (int i = row; i >= 1; --i) {
            for (int j = 1; j <= i; ++j){
                System.out.print("*");
            }
            System.out.println();
        }

     //

            System.out.print("Enter number of rows: ");
            int rows = scanner.nextInt();

            for (int i = 1; i <= rows; i++) {
                // print spaces first
                for (int space = rows; space > i; space--) {
                    System.out.print(" ");
                }
                // then print stars
                for (int star = 1; star <= i; star++) {
                    System.out.print("*");
                }
                System.out.println(); // move to next line
            }

        //    *
        //   ***
        //  *****
        // *******
        //*********
        int rows = 5;  // number of rows in the pyramid

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

//pascal triangle
                int rows = 6;  // number of rows in Pascal's Triangle

                for (int i = 0; i < rows; i++) {
                    // print leading spaces for alignment
                    for (int j = 0; j < rows - i; j++) {
                        System.out.print(" ");
                    }

                    int number = 1;  // first number in each row
                    for (int k = 0; k <= i; k++) {
                        System.out.print(number + " ");
                        // update number using binomial coefficient relation
                        number = number * (i - k) / (k + 1);
                    }
                    System.out.println();
                }

        //Floyd's triangle
                int rows = 6;  // number of rows
                int number = 1; // starting number

                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(number + " ");
                        number++;
                    }
                    System.out.println();
                }



        //Count vowels and consonants.
    String input;
    int vowel = 0;
    int consonant=0;
        System.out.print("Enter Any Words ");
        input=scanner.nextLine().toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch=='a' || ch=='e' || ch =='i' || ch =='o' || ch =='u') {
                vowel++;
                 }else if (Character.isLetter(ch)) {
                     consonant++;
            }
            }
        System.out.println("the no of vowel " +vowel);
        System.out.println("the no of consonant " +consonant);

        //Reverse a string.
        String word;
        System.out.print("Enter any string ");
        word= scanner.nextLine().toLowerCase();
        for (int i = word.length()-1; i >=0; i--) {
            System.out.print(word.charAt(i));

        }
*
        //Check whether a string is a palindrome.
        String str;
        String reverse="";
        System.out.print("enter any str ");
        str=scanner.nextLine().toLowerCase();

        for (int i = str.length()-1; i >=0; i--) {
           // System.out.print(str.charAt(i));
            reverse =reverse + str.charAt(i);

        }
        if (str.equals(reverse)){
            System.out.println("the string is a palindrome ");
        }else {
            System.out.println("not a palindrome ");
        }


        //Count the frequency of each character.
                System.out.print("Enter any String ");
                String str = scanner.nextLine().toLowerCase();

                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);
                    boolean alreadyPrinted = false;
                    for (int j = 0; j < i; j++) {
                        if (str.charAt(j) == c) {
                            alreadyPrinted = true;
                            break;
                        }
                    }
                    if (alreadyPrinted) {
                        continue;
                    }

                    int count = 0;
                    for (int j = 0; j < str.length(); j++) {
                        if (str.charAt(j) == c) {
                            count++;
                        }
                    }
                    System.out.println(c + " = " + count);
                }

        //Find the first non-repeating character.
        String str;
        System.out.print("Enter any string ");
        str=scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == c) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.print(c);
                break;
            }
        }

        //Remove duplicate characters.
        String str;
        System.out.print("Enter any string ");
        str=scanner.nextLine();
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            boolean alreadyPrinted=false;
            for (int j=0;j<i;j++){
                if (str.charAt(j)==c){
                    alreadyPrinted=true;
                    break;
                }
            }
            if (!alreadyPrinted){
                System.out.print(c);
            }
        }
        System.out.println();

        //Find the most frequent character in a string.
        String str;
        System.out.print("Enter any string ");
        str=scanner.nextLine();

        char mostFrequentChar = ' ';
        int maxCount = 0;

        for (int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            int count = 0;

            for (int j=0; j<str.length(); j++){
                if (str.charAt(j) == c){
                    count++;
                }
            }

            if (count > maxCount){
                maxCount = count;
                mostFrequentChar = c;
            }
        }

        System.out.println("Most frequent character: " + mostFrequentChar + " (appears " + maxCount + " times)");

        //check if two string are anagram
        // two string having same no of character

                System.out.print("Enter first string: ");
                String str1 = scanner.nextLine().toLowerCase();

                System.out.print("Enter second string: ");
                String str2 = scanner.nextLine().toLowerCase();

                if (str1.length() != str2.length()) {
                    System.out.println("Not an anagram");
                    return;
                }

                for (int i = 0; i < str1.length(); i++) {

                    char c = str1.charAt(i);

                    // Skip duplicate characters
                    boolean alreadyPrinted = false;
                    for (int j = 0; j < i; j++) {
                        if (str1.charAt(j) == c) {
                            alreadyPrinted = true;
                            break;
                        }
                    }

                    if (alreadyPrinted) {
                        continue;
                    }

                    int count1 = 0;
                    int count2 = 0;

                    // Count in first string
                    for (int j = 0; j < str1.length(); j++) {
                        if (str1.charAt(j) == c) {
                            count1++;
                        }
                    }

                    // Count in second string
                    for (int j = 0; j < str2.length(); j++) {
                        if (str2.charAt(j) == c) {
                            count2++;
                        }
                    }

                    if (count1 != count2) {
                        System.out.println("Not an anagram");
                        return;
                    }
                }

                System.out.println("Anagram");



            //Find the longest word in a sentence.
        System.out.print("Enter any sentence ");
        String sentence=scanner.nextLine();
        String[] words = sentence.split(" ");
        String longest=words[0];
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }

        }
        System.out.println("longest word is " + longest);


        //Count words in a sentence.
        System.out.print("Enter any sentence: ");
        String sentence=scanner.nextLine();
        String[] words = sentence.trim().split("\\s+");
        int count=0;
        for (String word:words){
            count++;
        }
        System.out.println("total words " +words.length);
        System.out.println("total words " +count);

        //Replace every space with "-".
        System.out.print("Enter any string: ");
        String sentence=scanner.nextLine();
        String after=sentence.replace(" ","_");
        System.out.println(after);
        //String after = sentence.replaceAll("\\s+", "_"); can be used for better result



        //Find the largest and smallest element.
        int[] Number=new int[5];
        for (int k=0;k< Number.length;k++){
            System.out.print("enter elements ");
            Number[k]=scanner.nextInt();
        }
        int smallest=Number[0];
        int largest=Number[0];
            for (int j : Number) {
                if (largest < j) {
                    largest = j;
                }

                if (smallest > j) {
                    smallest = j;
                }


            }
            System.out.println("largest element is "+largest);
            System.out.println("smallest element is "+smallest);


        //Find the second-largest element.
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            arr[i] = scanner.nextInt();
        }

        int largest = arr[0];
        int secondLargest = arr[0];

        for (int j : arr) {
            if (j > largest) {
                secondLargest = largest;
                largest = j;
            } else if (j > secondLargest && j != largest) {
                secondLargest = j;
            }
        }

        System.out.println("largest element is " + largest);
        System.out.println("second largest is " + secondLargest);

        //Remove duplicate elements.
        int[] arr1=new int[5];
        for (int i=0; i< arr1.length;i++){
            System.out.print("Enter elements ");
            arr1[i]= scanner.nextInt();
        }
        for (int i=0;i< arr1.length;i++){
            int current=arr1[i];
            boolean alreadyPrinted=false;
            for (int j=0;j<i;j++){
                if (arr1[j]==current){
                    alreadyPrinted=true;
                    break;
                }

            }
            if (!alreadyPrinted){
                System.out.println(current);
            }
        }



        String str;

        System.out.print("enter any sentence");
        str= scanner.nextLine();
        String[] word=str.split(" ");
        for (int i= word.length-1;i>=0 ;i--){
            System.out.print(word[i]+ " ");

        }

 //Reverse a list without using reverse().
                int[] num = new int[5];

                // Input
                for (int i = 0; i < num.length; i++) {
                    System.out.print("Enter " + (i + 1) + " element: ");
                    num[i] = scanner.nextInt();
                }

                int start = 0;
                int end = num.length - 1;
                int temp;

                // Reverse the array
                while (start < end) {

                    temp = num[start];
                    num[start] = num[end];
                    num[end] = temp;

                    start++;
                    end--;
                }

                // Print reversed array
                System.out.println("Reversed array:");

                for (int i = 0; i < num.length; i++) {
                    System.out.print(num[i] + " ");
                }

        //Count even and odd numbers in an array.
        int[] numbers=new int[6];
        int even=0;
        int odd=0;
        for (int i=0;i< numbers.length;i++){
            System.out.print("Enter " +(i+1)+" elements : ");
            numbers[i]= scanner.nextInt();
        }
        for (int number : numbers) {
            if (number % 2 == 0) {
                even++;

            } else {
                odd++;
            }

        }
        System.out.println("even count " +even);
        System.out.println("odd count "+ odd);

        //perfect number
        System.out.print("Enter number o check if it's perfect or not: ");
        int num=scanner.nextInt();
        int sum=0;
        for (int i=1;i<num;i++){
            if (num%i==0){
                sum +=i;
            }
        }
        if (num==sum){
            System.out.println(num + "is a perfect number ");
        }else {
            System.out.println("not a perfect number");
        }

        //Strong number
        System.out.print("Enter a number to check whether it is a Strong Number: ");
        int num=scanner.nextInt();
        int sum=0;
        int original=num;
        while (num > 0){
            int digit=num%10;
            sum+=methods.factorial(digit);
            num=num/10;
        }
        if (original==sum){
            System.out.println(original + " is a strong number ");
        }
        else {
            System.out.println(original + " not a strong number ");
        }


        //Decimal to Binary
        int[] binary=new int[32];
        int index=0;
        System.out.print("Enter any number: ");
        int number= scanner.nextInt();
        while(number>0){
            int remainder=number%2;
            binary[index]=remainder;
            index++;
            number=number/2;
        }
        for(int i=index-1;i>=0;i--){
            System.out.print(binary[i]);
        }

        //Binary to Decimal
        System.out.print("Enter any number: ");
        int num= scanner.nextInt();
        int decimal=0;
        int power=1;
        while(num>0){
            int digit=num%10;
            decimal=decimal+(digit*power);
            power=power*2;
            num=num/10;
        }
        System.out.print(decimal);

        //generate n numbers of prime number
        System.out.print("Enter any range: ");
        int n= scanner.nextInt();
        int count=0;
        int number=2;
        while (count < n) {

            if (methods.isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }

            number++;
        }

        //Print all Armstrong Numbers between 1 and 1000
        int number = 1;
        System.out.print("Enter upper limit: ");
        int n=scanner.nextInt();

        while (number <= n) {

            if (methods.isArmstrong(number)) {
                System.out.print(number + " ");
            }

            number++;
        }
*/
                scanner.close();
            }
        }
