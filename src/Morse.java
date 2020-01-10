import java.util.ResourceBundle;
import java.util.Scanner;

public class Morse {

    static public char[] letters = {'a', 'b', 'c', 'd', 'e', 'f',
            'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
            'x', 'y', 'z'};
    static public String[] morseLetters = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

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
            assert newText == str : "It has passed the test";
        }
//        str = ".- .-";
//        assert newText == str : "It has passed the test";
//        System.out.println("allie");
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
                        /*else {
                            newText += " ";
                            break;
                        }*/
                }
            }
//                newText += " ";
        }

        return newText;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
//            System.out.println("----------Select Options For Convertions------------");
//            System.out.println("\tEnter 1 For English to Morse Characters : ");
//            System.out.println("\tEnter 2 For Morse Characters to English : ");
//            System.out.println("----------------------------------------------------");
        System.out.println("Enter a string you want to convert either morse and english");
        input = scan.nextLine();
//            if (args[0].equals(1)){
//                System.out.println("----------------------------------------------------");
//                System.out.println("Enter an English word you'll like to covert morse : ");
//                 input = scan.nextInt();
//                System.out.println("------------------ Results -------------------------");

        System.out.println("English converted to morse");
        System.out.println(lettersToMorse(input));
        System.out.println("Morse converted to English");
        System.out.println(morseToLetters(input));
//            }
    }
//            else if (args[0].equals(2)){
//                System.out.println("----------------------------------------------------");
//                System.out.println("Enter an English word you'll like to covert morse : ");
//                 input = scan.nextInt();
//                System.out.println("------------------ Results -------------------------");

//            else {
//                System.out.println("Choose Correct Option");
//
//            }
//    }
}




