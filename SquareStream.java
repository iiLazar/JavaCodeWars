package successfulkata;

import java.util.stream.IntStream;

public class SquareStream {
    public static void main(String[] srgs) {
        int num = 9119;
        System.out.println(SquareDigit.squareDigits(num));
    }
}


class SquareDigit {

    public static int squareDigits(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        String numberString = String.valueOf(n);
        IntStream stream = numberString.chars();
        stream.map(dig -> (int) Math.pow(Character.getNumericValue(dig), 2))
                .forEach(square -> stringBuilder.append(square));

        return Integer.parseInt(stringBuilder.toString());
    }

}
