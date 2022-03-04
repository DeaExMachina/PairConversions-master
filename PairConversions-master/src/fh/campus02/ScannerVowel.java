package fh.campus02;
import java.util.Scanner;

public class ScannerVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a letter: ");
        String letter = scanner.next();

        while (!letter.equals("0")) {
                checkForVowel(letter);
                System.out.println("Enter another letter: ");
                letter = scanner.next();
            }

                System.out.println("You entered a 0, the scanner will be closed!");
                scanner.close();


        }

    public static void checkForVowel (String letter) {
        if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
            System.out.println("Your letter is a vowel!");
        }
        else {
            System.out.println("Your letter is not a vowel!");

        }
    }
}
