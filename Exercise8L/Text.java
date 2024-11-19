package Exercise8L;

import java.util.ArrayList;

public class Text {
    private ArrayList<String> lines;

    public Text() {
        lines = new ArrayList<>();
    }

    public void addLine(String line) {
        lines.add(line);
    }

    public int countCharacters() {
        int count = 0;
        for (String line : lines) {
            for (char c : line.toCharArray()) {
                if (!Character.isWhitespace(c)) {
                    count++;
                }
            }
        }
        return count;
    }

    public int countWords() {
        int wordCount = 0;
        for (String line : lines) {
            String[] words = line.trim().split("\\s+");
            wordCount += words.length;
        }
        return wordCount;
    }

    public int countSentences() {
        int sentenceCount = 0;
        for (String line : lines) {
            sentenceCount += line.split("[.!?]").length;
        }
        return sentenceCount;
    }

    public String findLongestWord() {
        String longestWord = "";
        for (String line : lines) {
            String[] words = line.trim().split("\\s+");
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }
        return longestWord;
    }

    public void printStatistics() {
        System.out.println("Text statistics:");
        System.out.println("There are " + countCharacters() + " letters.");
        System.out.println("There are " + countWords() + " words.");
        System.out.println("There are " + countSentences() + " sentences.");
        System.out.println("The longest word is: " + findLongestWord());
    }

    public String getText() {
        return String.join("\n", lines);
    }

    public boolean containsStop() {
        for (String line : lines) {
            if (line.toLowerCase().contains("stop")) {
                return true;
            }
        }
        return false;
    }
}

