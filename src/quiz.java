import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
                "Which loop-based approach correctly checks if a string is a palindrome?",
                "How can you insert an element into an array at a specific position?",
                "Which query finds the department with the highest average salary?",
                "How does a union differ from a struct in C?",
                "Which of the following is the correct way to handle exceptions in Python?"
        };

        String[][] options = {
                {"A) Compare first and last characters moving inward",
                        "B) Reverse string with slicing and compare",
                        "C) Use str.find() method",
                        "D) Convert string to set and check length"},
                {"A) Overwrite the element at that position",
                        "B) Shift all elements right from that position, then insert",
                        "C) Use malloc() to add space automatically",
                        "D) Arrays in C cannot be modified"},
                {"A) SELECT department, MAX(salary) FROM employees;",
                        "B) SELECT department, AVG(salary) FROM employees GROUP BY department ORDER BY AVG(salary) DESC LIMIT 1;",
                        "C) SELECT department FROM employees WHERE salary = MAX(salary);",
                        "D) SELECT department, SUM(salary) FROM employees GROUP BY department;"},
                {"A) Union stores all members simultaneously",
                        "B) Union stores only one member at a time, sharing memory",
                        "C) Struct is more memory-efficient than union",
                        "D) Union allows arrays but struct does not"},
                {"A) try/except ValueError",
                        "B) catch ValueError",
                        "C) handle ValueError",
                        "D) try/finally"}
        };

        String[] answers = {"A", "B", "B", "B", "A"};
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQ" + (i + 1) + ": " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your answer: ");
            String guess = scanner.nextLine().trim().toUpperCase();

            if (guess.equals(answers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + answers[i]);
            }
        }

        System.out.println("\nYour final score: " + score + "/" + questions.length);
        scanner.close();
    }
}
