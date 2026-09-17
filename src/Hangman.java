import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String filePath = "words.txt";
        ArrayList<String> words = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(
                new FileReader("src/words.txt")
        );) {
                String line;
            while ((line = br.readLine()) != null) {
                words.add(line.trim());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        } catch (IOException e) {
            System.out.println("Error reading file");
            return;
        }

        if (words.isEmpty()) {
            System.out.println("No words found in words.txt");
            return;
        }

        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));

        Scanner sc = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuess = 0;

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        System.out.println("Welcome to Java Hangman Game");

        while (wrongGuess < 6) {

            System.out.print(getHangmanArt(wrongGuess));
            System.out.print("Word: ");

            for (char c : wordState) {
                System.out.print(c + " ");
            }

            System.out.print("\nGuess a letter: ");
            char guess = sc.next().toLowerCase().charAt(0);

            if (word.indexOf(guess) >= 0) {
                System.out.println("Correct guess");

                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }

                if (!wordState.contains('_')) {
                    System.out.println(getHangmanArt(wrongGuess));
                    System.out.println("YOU WIN");
                    System.out.println("The word was " + word);
                    break;
                }

            } else {
                wrongGuess++;
                System.out.println("Wrong guess");
            }
        }

        if (wrongGuess == 6) {
            System.out.println(getHangmanArt(wrongGuess));
            System.out.println("GAME OVER");
            System.out.println("The word was " + word);
        }

        sc.close();
    }

    static String getHangmanArt(int wrongGuess) {
        return switch (wrongGuess) {
            case 1 -> """
                      O
                    """;
            case 2 -> """
                      O
                      |
                    """;
            case 3 -> """
                      O
                     /|
                    """;
            case 4 -> """
                      O
                     /|\\
                    """;
            case 5 -> """
                      O
                     /|\\
                     /
                    """;
            case 6 -> """
                      O
                     /|\\
                     / \\
                    """;
            default -> "";
        };
    }
}