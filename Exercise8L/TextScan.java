package Exercise8L;

import java.util.Scanner;

public class TextScan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Text userText = new Text();
        boolean stopNoted = false;

        System.out.println("Enter your notes: ");

        while (true) {
            String input = scan.nextLine();

            if (input.isEmpty()) {
                break;
            }

            if (input.toLowerCase().contains("stop")) {
                stopNoted = true;
            }

            userText.addLine(input);
        }

        if (stopNoted) {
            System.out.println("You have typed 'stop' in your text.");
        }

        userText.printStatistics();
    }
}
