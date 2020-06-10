package successfulkata;

public class Diamond1 {
    public static void main(String[] args) {
        System.out.println(Diamond.print(11));
    }
}

class Diamond {
    public static String print(int n) {
//        return null if n < 0 || even;
//        append n (*)s to mainStringBuilder + \n;
//        iterate i from 1 to n % 2:
//          to helperStringBuilder
//              append i spaces
//              append (n - 2*i) (*)s
//              append \n;
//          append helperSB to beginning and end of mainSB;
        boolean isImpossible = (n < 0 || n % 2 == 0);
        if (isImpossible) return null;

        StringBuilder mainStringBuilder = new StringBuilder();
        mainStringBuilder.append("*".repeat(n));
        mainStringBuilder.append("\n");
//        if (n == 1) return mainStringBuilder.toString();

        for (int i = 1; i <= (n / 2); i++) {
            StringBuilder helperStringBuilder = new StringBuilder();
            helperStringBuilder.append(" ".repeat(i));
            helperStringBuilder.append("*".repeat((n - 2 * i)));
            helperStringBuilder.append("\n");

            mainStringBuilder.append(helperStringBuilder);
            mainStringBuilder.insert(0, helperStringBuilder);
        }

    return mainStringBuilder.toString();
    }
}