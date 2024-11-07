package Exercise8L;

import java.util.Scanner;

public class TextScan {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your notes: ");

        String text = scan.nextLine();

        StringBuilder allText = new StringBuilder();
        while (!text.isEmpty()) {
            if (DataScan.containsStop(text)) {
                System.out.println("You have typed stop");
                System.out.println();
                break;

            }
            allText.append(text).append("\n");
            text = scan.nextLine();}

        String fullText = allText.toString();

        String[] words = fullText.split(" ");
        String[] lines = fullText.split("\n");

        System.out.println("My notes: " );

        for (String word : words) {
            System.out.println(word);
        }



        int characterCount = DataScan.countCharacters(fullText);
        int wordCount = DataScan.countWords(fullText);
        int lineCount = lines.length;
        String longestWord = DataScan.findLongestWord(fullText);

        System.out.println("There are " + (characterCount-1) + " characters");
        System.out.println("There are " + wordCount + " words");
        System.out.println("There are " + lineCount + " lines");
        System.out.println("The longest word is " + longestWord);

    }}
