import java.util.ResourceBundle;
import java.util.Scanner;

public class Morse {

    static public char[] letters = {'a', 'b', 'c', 'd', 'e', 'f',
            'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
            'x', 'y', 'z', ' '};
    static public String[] morseLetters = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "/"};

    public static String lettersToMorse(String str) {

        String textToChange = "";
        String newText = "";

        textToChange = str.toLowerCase();
        for (int i = 0; i < textToChange.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if (textToChange.charAt(i) == letters[j]) {
                    newText += morseLetters[j];
                    newText += " ";
                    break;
                }
                if (textToChange.charAt(i) == ' ') {
                    newText = newText + "/";
                    break;
                }
            }
//            assert newText == str : "It has passed the test";
        }
        return newText;
    }

    public static String morseToLetters(String str) {

        String newText = "";
        newText = newText.toLowerCase();
        String textToChange = str.trim();
        String[] words = textToChange.split("   ");
        for (String word : words) {
            for (String letter : word.split(" ")) {
                for (int x = 0; x < morseLetters.length; x++) {
                    if (letter.equals(morseLetters[x])) {
                        newText = newText + letters[x];
                    }
                }
            }
        }

        return newText;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner i = new Scanner(System.in);
        int inp = 0;

        while (true) {
            System.out.println("----------Select Options For Convertions------------");
            System.out.println("\tEnter 1 For English to Morse Characters : ");
            System.out.println("\tEnter 2 For Morse Characters to English : ");
            String input = scan.nextLine();
            System.out.println("----------------------------------------------------");

            if (input.equals("1")) { ;
                System.out.println("----------------------------------------------------");
                System.out.println("Enter an English word you'll like to covert morse : ");
                input = scan.nextLine();
                System.out.println("------------------ Results -------------------------");
                System.out.println(lettersToMorse(input));

            } else if (input.equals("2")) {
                System.out.println("----------------------------------------------------");
                System.out.println("Enter an English word you'll like to covert morse : ");
                input = scan.nextLine();
                System.out.println("------------------ Results -------------------------");
                System.out.println(morseToLetters(input));
            } else {
                System.out.println("Choose Correct Option");
            }
        }
    }
}



