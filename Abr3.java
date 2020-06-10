package successfulkata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Abr3 {
    public static void main(String[] args) {
        System.out.println(Abbreviator3.abbreviate("long sent5656465 ddenc**&%^$#e to be abbreviated hyphen-containing"));
    }
}


class Abbreviator3 {

    public static String abbreviate(String string) {
//        traverse through string letter by letter
//        if character is a letter append it to helperStringBuilder (contains current word)
//        increment counter +1
//        if character is not a letter {
//          build word (string) from helperStringBuilder;
//          if word was shorter than 4 characters (includes ""), append it to mainStringBuilder;
//          else append first character + (counter - 2) + last character;
//          clear counter;
//          clear helper;
//          append non-letter char to mainStringBuilder;
//        }
//        if helper is not empty, do the method done when char is a non-letter
//        return string from mainStringBuilder

        if (string == null) return null;
        if (string.length() < 4) return string;

        StringBuilder mainStringBuilder = new StringBuilder();
        StringBuilder helperStringBuilder = new StringBuilder();
        int counter = 0;
        Pattern letterPattern = Pattern.compile("[a-zA-Z]");

        for (int i = 0; i < string.length(); i++) {
            char currentCharacter = string.charAt(i);
            Matcher letterMatcher = letterPattern.matcher(Character.toString(currentCharacter));
            boolean isLetter = letterMatcher.matches();

            if(isLetter) {
                helperStringBuilder.append(currentCharacter);
                counter ++;
            } else {
                appendHelperContent(mainStringBuilder, helperStringBuilder, counter);
                counter = 0;
                helperStringBuilder = new StringBuilder();
                mainStringBuilder.append(currentCharacter);

            }
        }

        appendHelperContent(mainStringBuilder, helperStringBuilder, counter);

        return mainStringBuilder.toString();
    }

    private static void appendHelperContent(StringBuilder mainStringBuilder, StringBuilder helperStringBuilder, int counter) {
        String word = helperStringBuilder.toString();
        boolean isShortWord = word.length() < 4;
        if (isShortWord) {
            mainStringBuilder.append(word);
        } else {
            mainStringBuilder.append(word.charAt(0)).append(counter - 2).append(word.charAt(word.length() - 1));
        }
    }
}