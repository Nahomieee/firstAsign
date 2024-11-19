package Exercise8L;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTasklist {

    @Test
    public void testFindLongestWord() {
        Text userText = new Text();

        userText.addLine("städa äta springa");

        String longestWord = userText.findLongestWord();

        assertEquals("springa", longestWord);
    }

    @Test
    public void testCountCharacters() {

        Text userText = new Text();

        userText.addLine("Hello World");

        int characterCount = userText.countCharacters();

        assertEquals(10, characterCount);  // "Hello World" (10 tecken) + "This is a test sentence." (17 tecken)
    }

    @Test
    public void testCountSentences() {
        Text userText = new Text();

        userText.addLine("This is the first sentence.");

        int sentenceCount = userText.countSentences();

        assertEquals(1, sentenceCount);
    }
}

