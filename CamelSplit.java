package successfulkata;

public class CamelSplit {
    public static void main(String[] args) {
        String string = "CamelCaseSplitter";
        System.out.println(Solution.camelCase(string));
    }
}

class Solution {
    public static String camelCase(String input) {
        /*
        * if string is "" return "";
        * prepare a StringBuilder;
        * add first character to SBuilder;
        * traverse through input character by character;z
        * starting from second char, if character is a capital letter,
        * add space to SBuilder, then the character;
        * output string from SBuilder;
        * */

        if (input.equals("")) return "";

        StringBuilder stringBuilder = new StringBuilder(String.valueOf(input.charAt(0)));

        for (int i = 1; i < input.length(); i++) {
            char character = input.charAt(i);
            boolean isCapital = Character.isUpperCase(character);

            if (isCapital) {
                stringBuilder.append(" ").append(String.valueOf(character));
            } else {
                stringBuilder.append(String.valueOf(character));
            }
        }

        return stringBuilder.toString();
    }
}