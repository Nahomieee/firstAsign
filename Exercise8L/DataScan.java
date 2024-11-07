package Exercise8L;

public class DataScan {
    public static int countCharacters(String text) {
        return text.length();
    }

    public static int countWords(String text) {
        String[] words = text.trim().split("\\s+");
        return words.length;

    }
    public static boolean containsStop(String text) {
        return text.toLowerCase().contains("stop");
    }
    public static int countLines(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] lines = text.split("\n");
        return lines.length;
    }

    public static String findLongestWord(String text) {
        String[] words = text.trim().split("\\s+");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
    }


