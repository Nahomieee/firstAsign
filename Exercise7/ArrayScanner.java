package Exercise7;

import java.util.Scanner;

public class ArrayScanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] names = new String[5];

        for(int i = 0;i< names.length; i++){
            names[i] = scan.nextLine();


        }
        String hi= "How are you ";

        System.out.println(hi + names[0] + " and " + names[names.length-1]);

    }
}
