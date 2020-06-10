package successfulkata;

public class Square1 {
    public static void main(String[] srgs) {
        int num = 9119;
        System.out.println(SquareDigit1.squareDigits(num));
    }
}


class SquareDigit1 {

    public static int squareDigits(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        String numberString = String.valueOf(n);

        for (int i = 0; i < numberString.length(); i++) {
            int digit = Character.getNumericValue(numberString.charAt(i));
            int singleSquare = (int) Math.pow(digit, 2);
            stringBuilder.append(singleSquare);
        }

        return Integer.parseInt(stringBuilder.toString());
    }

}