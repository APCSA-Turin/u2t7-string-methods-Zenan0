package U2T7_P2_MoreStringMethods;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        int wordCount = 0;
        System.out.print("Enter first word: ");
        String previousWord = scan.nextLine();
        wordCount++;
        System.out.print("Enter next word: ");
        String currentWord = scan.nextLine();
        wordCount++;
        while (score < 50) {
            if (currentWord.compareTo(previousWord) > 0) {
                score += 2;
                System.out.println("+2 points: current word alphabetically after; SCORE: " + score);
            } else if (currentWord.compareTo(previousWord) < 0) {
                score -= 5;
                System.out.println("-5 points: current word alphabetically before; SCORE: " + score);
            } else if (currentWord.compareTo(previousWord) == 0) {
                score -= 10;
                System.out.println("-10 points: current word is the same as the previous word; SCORE: " + score);
            }
            if (currentWord.substring(0,2).equals(previousWord.substring(previousWord.length() - 2))) {
                score += 5;
                System.out.println("+5 points: first two letters of current word match last two letters of previous word; SCORE: " + score);
            }
             String firstLetterPrevWord = previousWord.substring(0, 1);
            if (currentWord.indexOf(firstLetterPrevWord) != -1) {
                score += 3;
                System.out.println("+3 points: the first letter of the previous word was found in your current word; SCORE: " + score);
            }
            if(currentWord.length() == previousWord.length()) {
                score += 5;
                System.out.println("+5 points: the current word and the previous word are the same length; SCORE: " + score);
            }
            if (score < 50) {
                System.out.print("Enter next word: ");
                previousWord = currentWord;
                currentWord = scan.nextLine();
                wordCount++;
            }
        }
        System.out.println("You win! It took you " + wordCount + " words! Try again for a lower word count :)");
        scan.close();
    }
}
