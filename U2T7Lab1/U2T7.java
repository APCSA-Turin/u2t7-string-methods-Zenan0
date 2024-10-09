package U2T7Lab1;
import java.util.Scanner;

public class U2T7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word1 = scan.nextLine();
        System.out.println("Enter a second word: ");
        String word2 = scan.nextLine();

        int word1Length = word1.length();
        int word2Length = word2.length();
        if (word1Length > word2Length) {
            System.out.println(word1 + " is longer.");
        } else if (word2Length > word1Length) {
            System.out.println(word2 + " is longer.");
        } else {
            System.out.println("Both strings have the same length.");
        }

        String word1FirstHalf = word1.substring(0, word1Length/2);
        String word1SecondHalf = word1.substring(word1Length/2);
        String word2FirstHalf = word2.substring(0, word2Length/2);
        String word2SecondHalf = word2.substring(word2Length/2);
        System.out.println("First half: " + word1FirstHalf);
        System.out.println("Second half: " + word1SecondHalf);
        System.out.println("First Half: " + word2FirstHalf);
        System.out.println("Second half: " + word2SecondHalf);

        int startingIndex = word1.indexOf(word2);
        if (startingIndex > -1) {
            System.out.println(word2 + " is found in " + word1 + " at index " + startingIndex);
        } else {
            System.out.println(word2 + " is NOT found in " + word1);
        }

        scan.close();
    }
}
